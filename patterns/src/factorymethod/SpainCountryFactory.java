package factorymethod;

public class SpainCountryFactory extends CountryFactory{
    @Override
    public Country createCountry() {
        return new Spain();
    }
}
