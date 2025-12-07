class mesinMotor extends defaultMesin {
    private String tipeMotor;

    public mesinMotor(String nama, int hp, String tipeMotor) {
        super(nama, hp);
        this.tipeMotor = tipeMotor;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Mesin Motor " + namaMesin + " | Tipe: " + tipeMotor + " | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    public double nilaiPerforma() {
        return tenagaHP * 1.2;
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Motor";
    }

    public String suaraMesin() {
        return "Brummm! Mesin motor menyala!";
    }
}
