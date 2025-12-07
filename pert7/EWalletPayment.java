public class EWalletPayment implements PaymentMethod {

    private String namaLayanan;
    private double nominal;
    private double saldo;

    public EWalletPayment(String namaLayanan, double nominal, double saldo) {
        this.namaLayanan = namaLayanan;
        this.nominal = nominal;
        this.saldo = saldo;
    }

    @Override
    public String processPayment() {
        double total = nominal + getTransactionFee();

        if (saldo >= total) {
            saldo -= total;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan;
    }

    @Override
    public double getTransactionFee() {
        return 2000;  // biaya tetap
    }

    @Override
    public double getBalance() {
        return saldo;
    }
}
