public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {

    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;

    // Constructor
    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false;
    }

    // ====================== IMPLEMENTASI METHOD WAJIB ======================

    @Override
    public double hitungGaji(int jamKerja) {
        double total = jamKerja * gajiPerJam;
        System.out.println("Total gaji " + nama + ": Rp " + total);
        return total;
    }

    @Override
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak diperpanjang selama " + durasiBulan + " bulan.");
    }

    @Override
    public void login(String pin) {
        if (pin.equals(pinRahasia)) {
            sedangLogin = true;
            System.out.println("Login berhasil! Selamat datang, " + nama + ".");
        } else {
            System.out.println("Login gagal! PIN salah.");
        }
    }

    @Override
    public void logout() {
        if (sedangLogin) {
            sedangLogin = false;
            System.out.println("Logout berhasil!");
        } else {
            System.out.println("Anda belum login.");
        }
    }

    // ====================== OVERRIDE DEFAULT METHOD ======================

    @Override
    public String getRoleAkses() {
        return "Magang IT";  // override dari default "Staff Biasa"
    }

    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari";  // override dari default "Tersedia 12 hari"
    }
}
