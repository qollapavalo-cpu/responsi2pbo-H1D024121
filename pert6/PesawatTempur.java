class PesawatTempur extends KendaraanGalaksi {

    private int jumlahRudal;

    public PesawatTempur(String nama, int kapasitas, int jumlahRudal) {
        super(nama, kapasitas);
        this.jumlahRudal = jumlahRudal;
    }

    @Override
    public void aktifkanMesin() {
        if (energi < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak bisa diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    public void jelajah(int km) {
        double konsumsi = km * 3; // 3% per km

        if (energi >= konsumsi) {
            energi -= konsumsi;
            System.out.println("Pesawat tempur menjelajah sejauh " + km + " km.");
        } else {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + km + " km.");
        }
    }

    public void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Rudal tidak mencukupi!");
        }
    }

    @Override
    public void isiEnergi(double jumlah) {
        energi += jumlah;
        if (energi > 100) energi = 100;
    }
}
