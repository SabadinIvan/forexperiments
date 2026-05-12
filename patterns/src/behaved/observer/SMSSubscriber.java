package behaved.observer;

public class SMSSubscriber implements Observer {
    private final String phoneNumber;

    public SMSSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String message) {
        System.out.println("SMS отправлено на " + phoneNumber + ": " + message);
    }
}
