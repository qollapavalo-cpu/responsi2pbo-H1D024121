class UjiKaryawan {
    public static void main(String[] args) {
        // Tampilkan Header
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        // Buat objek Karyawan biasa (Budi)
        Karyawan karyawanLamaGajiUMR = new Karyawan("Joko Santoso", 4500000);
        karyawanLamaGajiUMR.tampilInfo();

        System.out.println(); // Baris baru/jarak

        // Buat objek Manajer (Siti)
        Manajer manajerAnakBos = new Manajer("Sri Mutia", 6000000, 2500000);
        manajerAnakBos.tampilInfo();
    }
}
