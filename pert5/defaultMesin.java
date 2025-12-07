class defaultMesin {
    protected String namaMesin;
    protected int tenagaHP;

    public defaultMesin(String namaMesin, int tenagaHP) {
        this.namaMesin = namaMesin;
        this.tenagaHP = tenagaHP;
    }

    public void tampilInfo() {
        System.out.println("Mesin " + namaMesin + " | Tenaga: " + tenagaHP + " HP");
    }

    public double nilaiPerforma() {
        return tenagaHP * 1.0;
    }

    public String kategoriMesin() {
        return "Mesin Umum";
    }
}
