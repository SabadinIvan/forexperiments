package behaved.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer smsUser1 = new SMSSubscriber("+7-999-123-45-67");
        Observer smsUser2 = new SMSSubscriber("+7-999-765-43-21");
        Observer emailUser1 = new EmailSubscriber("user1@example.com");
        Observer emailUser2 = new EmailSubscriber("user2@example.com");

        agency.registerObserver(smsUser1);
        agency.registerObserver(smsUser2);
        agency.registerObserver(emailUser1);
        agency.registerObserver(emailUser2);

        agency.setLatestNews("Новый паттерн Observer в действии!");

        agency.unregisterObserver(smsUser2);

        agency.setLatestNews("Обновление: smsUser2 отписался от новостей.");

        agency.unregisterObserver(emailUser1);

        agency.setLatestNews("Обновление: emailUser1 отписался он новостей.");
    }
}
