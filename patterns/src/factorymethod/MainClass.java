package factorymethod;

public class MainClass {

    public static void main(String[] args) {
        Country russia = CountryFactory.createCountry("Russia");
        russia.singAnthem();

        Country georgia = CountryFactory.createCountry("georgia");
        georgia.singAnthem();

        Country spain = CountryFactory.createCountry("SpAiN");
        spain.singAnthem();
    }
}
