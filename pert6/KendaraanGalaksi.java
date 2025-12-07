abstract class KendaraanGalaksi {
    protected String nama;
    protected double energi; // persentase
    protected int kapasitas;

    public KendaraanGalaksi(String nama, int kapasitas) {
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.energi = 100; // default energi penuh
    }

    public void tampilStatus() {
        System.out.println(nama + " | Energi: " + energi + "% | Kapasitas: " + kapasitas + " orang");
    }

    public abstract void aktifkanMesin();
    public abstract void jelajah(int km);
    public abstract void isiEnergi(double jumlah);
}
