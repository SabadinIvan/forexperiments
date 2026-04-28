package generating.factorymethod;

public class SimpleCountryFactory {

        public static Country createCountry(String country) {
        return switch (country.toLowerCase()) {
            case "russia" -> new Russia();
            case "georgia" -> new Georgia();
            case "spain" -> new Spain();
            default -> throw new IllegalArgumentException("We dont have county " + country);
        };
    }
}
