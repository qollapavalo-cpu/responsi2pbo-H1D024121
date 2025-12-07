interface AksesSistem {

    // Method abstrak wajib
    void login(String pin);

    void logout();

    // Default method (opsional)
    default String getRoleAkses() {
        return "Staff Biasa";
    }
}
