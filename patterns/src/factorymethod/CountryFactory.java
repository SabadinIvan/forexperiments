package factorymethod;

public abstract class CountryFactory {

    public abstract Country createCountry();

    public void handleCountry() {
        Country country = createCountry();
        country.singAnthem();
    }
}
