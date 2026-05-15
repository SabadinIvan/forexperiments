package behaved.strategy;

public class CashOnDeliveryPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Оплата наличными при получении. Сумма: $" + amount);
    }
}
