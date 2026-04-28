package generating.factorymethod;

public class RussiaCountryFactory extends CountryFactory {
    @Override
    public Country createCountry() {
        return new Russia();
    }
}
