package builder;

public class Country {
    private final String name;
    private final String anthem;
    private final String flag;
    private final String coatOfArms;
    private final long area;
    private final String language;

    private Country(CountryBuilder builder) {
        this.name = builder.name;
        this.anthem = builder.anthem;
        this.flag = builder.flag;
        this.coatOfArms = builder.coatOfArms;
        this.area = builder.area;
        this.language = builder.language;
    }

    public String getName() {
        return name;
    }

    public String getAnthem() {
        return anthem;
    }

    public String getFlag() {
        return flag;
    }

    public String getCoatOfArms() {
        return coatOfArms;
    }

    public long getArea() {
        return area;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", anthem='" + anthem + '\'' +
                ", flag='" + flag + '\'' +
                ", coatOfArms='" + coatOfArms + '\'' +
                ", area=" + area +
                ", language='" + language + '\'' +
                '}';
    }


    public static class CountryBuilder {
        private String name;
        private String anthem;
        private String flag;
        private String coatOfArms;
        private long area;
        private String language;
        public CountryBuilder() {
        }

        public CountryBuilder name(String name) {
            this.name = name;
            return this;
        }

        public  CountryBuilder anthem(String anthem) {
            this.anthem = anthem;
            return this;
        }

        public  CountryBuilder flag(String flag) {
            this.flag = flag;
            return this;
        }

        public CountryBuilder coatOfArms(String coatOfArms) {
            this.coatOfArms = coatOfArms;
            return this;
        }

        public CountryBuilder area(long area) {
            this.area = area;
            return this;
        }

        public CountryBuilder language(String language) {
            this.language = language;
            return this;
        }

        public Country build() {
            return new Country(this);
        }
    }
}
