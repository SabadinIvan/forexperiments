package generating.factorymethod;

public class GeorgiaCountryFactory extends CountryFactory{
    @Override
    public Country createCountry() {
        return new Georgia();
    }
}
