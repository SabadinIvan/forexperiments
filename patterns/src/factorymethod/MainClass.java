package factorymethod;

public class MainClass {

    public static void main(String[] args) {
        CountryFactory russiaFactory = new RussiaCountryFactory();
        russiaFactory.handleCountry();

        CountryFactory georgiaFactory = new GeorgiaCountryFactory();
        georgiaFactory.handleCountry();

        CountryFactory spainFactory = new SpainCountryFactory();
        spainFactory.handleCountry();

        Country russia = SimpleCountryFactory.createCountry("Russia");
        russia.singAnthem();

        Country georgia = SimpleCountryFactory.createCountry("georgia");
        georgia.singAnthem();

        Country spain = SimpleCountryFactory.createCountry("SpAiN");
        spain.singAnthem();
    }
}
