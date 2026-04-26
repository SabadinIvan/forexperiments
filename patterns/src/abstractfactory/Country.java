package abstractfactory;

import abstractfactory.attributes.AnthemOfCountry;
import abstractfactory.attributes.CoatOfArmsOfCountry;
import abstractfactory.attributes.FlagOfCountry;
import abstractfactory.factories.CountryFactory;

public class Country {
    private final FlagOfCountry flag;
    private final AnthemOfCountry anthem;
    private final CoatOfArmsOfCountry coatOfArms;

    public Country(CountryFactory factory) {
        this.flag = factory.createFlag();
        this.anthem = factory.createAnthem();
        this.coatOfArms = factory.createCoatOfArms();
    }

    public void doAttributes() {
        flag.hangFlag();
        anthem.singAnthem();
        coatOfArms.hangCoatOfArms();
    }
}
