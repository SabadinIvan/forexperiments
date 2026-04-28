package generating.singleton;

// Потокобезопасный синглтон с синхронизацией
public class SpainThreadSafeSingleton {
    private static SpainThreadSafeSingleton instance;

    private SpainThreadSafeSingleton() {}

    public static synchronized SpainThreadSafeSingleton getInstance() {
        // синхронизован, но задержки в работе
        if (instance == null) {
            instance = new SpainThreadSafeSingleton();
        }
        return instance;
    }

    public void singAnthem() {
        String anthem = "¡Viva España!...";
        System.out.println(anthem);
    }
}
