package behaved.strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Ошибка: не выбран способ оплаты!");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
