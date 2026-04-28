package generating.abstractfactory.attributes;

public class FlagOfRussia implements FlagOfCountry {
    @Override
    public void hangFlag() {
        System.out.println("Флаг России");
    }
}
