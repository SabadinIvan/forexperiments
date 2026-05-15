package behaved.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплачено картой " + cardNumber + " на сумму: $" + amount);
    }
}
