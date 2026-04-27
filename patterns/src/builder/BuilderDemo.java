package builder;

public class BuilderDemo {

    public static void main(String[] args) {
        Country russia = new Country.CountryBuilder().name("Россия").anthem("Гимн России").build();
        Country spain = new Country.CountryBuilder().name("Spain").anthem("Anthem of Spain").flag("Flag of Spain").build();

        System.out.println(russia);
        System.out.println(spain);
    }
}
