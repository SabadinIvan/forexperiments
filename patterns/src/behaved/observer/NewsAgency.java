package behaved.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String latestNews;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }

    // Метод для установки новости и оповещения подписчиков
    public void setLatestNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }
}
