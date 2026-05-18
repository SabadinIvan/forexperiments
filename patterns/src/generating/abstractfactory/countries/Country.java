package generating.abstractfactory.countries;

import generating.abstractfactory.countries.attributes.AnthemOfCountry;
import generating.abstractfactory.countries.attributes.CoatOfArmsOfCountry;
import generating.abstractfactory.countries.attributes.FlagOfCountry;
import generating.abstractfactory.countries.factories.CountryFactory;

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
