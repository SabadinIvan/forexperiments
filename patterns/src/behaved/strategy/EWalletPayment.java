package behaved.strategy;

public class EWalletPayment implements PaymentStrategy {
    private final String walletId;

    public EWalletPayment(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплачено через кошелёк " + walletId + " на сумму: $" + amount);
    }
}
