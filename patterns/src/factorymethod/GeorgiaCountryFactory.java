package factorymethod;

public class GeorgiaCountryFactory extends CountryFactory{
    @Override
    public Country createCountry() {
        return new Georgia();
    }
}
