package abstractfactory.attributes;

public class AnthemOfRussia implements AnthemOfCountry {
    @Override
    public void singAnthem() {
        System.out.println("Гимн России");
    }
}
