package generating.singleton;


public class SerbiaStaticSingleton {
    private static final SerbiaStaticSingleton instance = new SerbiaStaticSingleton();

    private SerbiaStaticSingleton() {}

    public static SerbiaStaticSingleton getInstance() {
        return instance;
    }

    public void singAnthem() {
        String anthem = "Боже правде, ти што спасе...";
        System.out.println(anthem);
    }
}
