class mesinTraktor extends defaultMesin {
    protected double kapasitasTarik;

    public mesinTraktor(String nama, int hp, double kapasitasTarik) {
        super(nama, hp);
        this.kapasitasTarik = kapasitasTarik;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Mesin Traktor " + namaMesin + " | Tarik: " + kapasitasTarik + " ton | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    public double nilaiPerforma() {
        return (tenagaHP * 0.9) + (kapasitasTarik * 10);
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Traktor";
    }

    public String suaraMesin() {
        return "GGGRRRR! Hidup mesinnn!";
    }
}
