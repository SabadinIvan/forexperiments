package generating.singleton;

// Потокобезопасный синглтон с блокировкой
public class GeorgiaDoubleCheckedLockingSingleton {
    private static volatile GeorgiaDoubleCheckedLockingSingleton instance;

    private GeorgiaDoubleCheckedLockingSingleton() {}

    public static GeorgiaDoubleCheckedLockingSingleton getInstance() {
        // первая проверка без блокировки
        if (instance == null) {
            synchronized (GeorgiaDoubleCheckedLockingSingleton.class) {
                // вторая проверка после получения блокировки
                if (instance == null) {
                    instance = new GeorgiaDoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }

    public void singAnthem() {
        String anthem = "ჩემი ხატია სამშობლო...";
        System.out.println(anthem);
    }
}
