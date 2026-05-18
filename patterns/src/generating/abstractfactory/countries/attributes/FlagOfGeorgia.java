package generating.abstractfactory.countries.attributes;

public class FlagOfGeorgia implements FlagOfCountry {
    @Override
    public void hangFlag() {
        System.out.println("Флаг Грузии");
    }
}
