// Gunakan keyword untuk mewarisi class Karyawan
class Manajer extends Karyawan {
    // Deklarasikan variabel tambahan khusus Manajer (tunjangan)
    private double tunjangan;

    // Constructor
    // Tips: Gunakan 'super' untuk memanggil constructor parent
    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }
    // Method Override tampilInfo
    // Tips: Tampilkan info dasar, lalu tambahkan info tunjangan dan total gaji
    @Override
    void tampilInfo() {
        System.out.println("Status: Manajer");
        System.out.printf("Nama: %s | Gaji Pokok: Rp %f | Tunjangan: Rp %f\n", nama, gajiPokok, tunjangan);
        System.out.printf("Total Pendapatan: %f", gajiPokok + tunjangan);
    }
}
