package behaved.strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("2222-3333-4444-6666"));
        cart.checkout(150.00);

        cart.setPaymentStrategy(new EWalletPayment("ewallet@wallet.com"));
        cart.checkout(25.20);

        cart.setPaymentStrategy(new CashOnDeliveryPayment());
        cart.checkout(560.20);
    }
}
