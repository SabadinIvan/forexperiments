package generating.singleton;

// Данный синглтон не потокобезопасный...
public class RussiaSingleton {
    private static RussiaSingleton instance;

    private RussiaSingleton(){}

    public static RussiaSingleton getInstance() {
        // так как сюда могут зайти два потока (три, четыре...)
        if (instance == null) {
            instance = new RussiaSingleton();
        }
        return instance;
    }

    public void singAnthem() {
        String anthem = "Россия священная наша держава...";
        System.out.println(anthem);
    }
}
