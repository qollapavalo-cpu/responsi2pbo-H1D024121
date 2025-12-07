class UjiSDM {
    public static void main(String[] args) {

        System.out.println("=== SISTEM SDM PROGRAMMER MAGANG ===\n");

        // 1. Membuat objek
        ProgrammerMagang andi = new ProgrammerMagang("Andi", 50000.0, "1234");

        // 2. Hitung gaji
        andi.hitungGaji(160);

        // 3. Cek status cuti
        System.out.println("Status Cuti: " + andi.getStatusCuti());

        // 4. Login dengan PIN salah
        andi.login("9999");

        // 5. Login dengan PIN benar
        andi.login("1234");

        // 6. Cek role akses
        System.out.println("Role Akses: " + andi.getRoleAkses());

        // 7. Perpanjang kontrak
        andi.perpanjangKontrak(6);

        // 8. Logout
        andi.logout();
    }
}
