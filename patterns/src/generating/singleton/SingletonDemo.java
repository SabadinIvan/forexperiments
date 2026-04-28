package generating.singleton;


public class SingletonDemo {

    public static void main(String[] args) {
        RussiaSingleton russiaSingleton = RussiaSingleton.getInstance();
        russiaSingleton.singAnthem();

        SpainThreadSafeSingleton spainSingleton = SpainThreadSafeSingleton.getInstance();
        spainSingleton.singAnthem();

        GeorgiaDoubleCheckedLockingSingleton georgiaSingleton = GeorgiaDoubleCheckedLockingSingleton.getInstance();
        georgiaSingleton.singAnthem();

        SerbiaStaticSingleton serbiaSingleton = SerbiaStaticSingleton.getInstance();
        serbiaSingleton.singAnthem();
    }
}
