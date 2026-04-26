package abstractfactory.attributes;

public class AnthemOfGeorgia implements AnthemOfCountry {
    @Override
    public void singAnthem() {
        System.out.println("Гимн Грузии");
    }
}
