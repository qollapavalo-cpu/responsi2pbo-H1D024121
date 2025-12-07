class KapalEksplorasi extends KendaraanGalaksi {

    private int modulScan;

    public KapalEksplorasi(String nama, int kapasitas, int modulScan) {
        super(nama, kapasitas);
        this.modulScan = modulScan;
    }

    @Override
    public void aktifkanMesin() {
        if (energi < 15) {
            System.out.println("Energi terlalu rendah! Kapal tidak dapat memulai misi.");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    public void jelajah(int km) {
        double konsumsi = km * 2; // 2% per km

        if (energi >= konsumsi) {
            energi -= konsumsi;
            System.out.println("Kapal eksplorasi menjelajah sejauh " + km + " km.");
        } else {
            System.out.println("Energi tidak cukup untuk perjalanan sejauh " + km + " km.");
        }
    }

    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }

    @Override
    public void isiEnergi(double jumlah) {
        energi += jumlah;
        if (energi > 100) energi = 100;
    }
}
