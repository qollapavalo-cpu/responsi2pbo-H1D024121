class PaymentTest {
    public static void main(String[] args) {

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        EWalletPayment payment = new EWalletPayment("OVO", 50000, 150000);

        System.out.println("Saldo awal: " + 150000);
        System.out.println("Memproses pembayaran sebesar " + 50000 + "...");

        String hasil = payment.processPayment();
        System.out.println("\n" + hasil);

        System.out.println("Sisa saldo: " + payment.getBalance());
        System.out.println("Detail Transaksi: " + payment.getPaymentDetails());
    }
}
