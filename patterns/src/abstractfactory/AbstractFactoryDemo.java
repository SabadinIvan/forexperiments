package abstractfactory;

import abstractfactory.factories.CountryFactory;
import abstractfactory.factories.GeorgiaFactory;
import abstractfactory.factories.RussiaFactory;
import abstractfactory.factories.SpainFactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        String countryName = "russia";
//        String countryName = "georgia";
//        String countryName = "spain";


        CountryFactory countryFactory;
        countryFactory = switch (countryName.toLowerCase()) {
            case "russia" -> new RussiaFactory();
            case "georgia" -> new GeorgiaFactory();
            case "spain" -> new SpainFactory();
            default -> throw new IllegalArgumentException("We dont have county " + countryName);
        };

        Country country = new Country(countryFactory);
        country.doAttributes();
    }
}
