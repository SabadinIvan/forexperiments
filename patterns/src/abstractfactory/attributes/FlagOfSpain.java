package abstractfactory.attributes;

public class FlagOfSpain implements FlagOfCountry {
    @Override
    public void hangFlag() {
        System.out.println("Флаг Испании");
    }
}
