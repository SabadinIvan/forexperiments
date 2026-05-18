package generating.abstractfactory.countries.factories;

import generating.abstractfactory.countries.attributes.AnthemOfCountry;
import generating.abstractfactory.countries.attributes.CoatOfArmsOfCountry;
import generating.abstractfactory.countries.attributes.FlagOfCountry;

public interface CountryFactory {
    FlagOfCountry createFlag();
    AnthemOfCountry createAnthem();
    CoatOfArmsOfCountry createCoatOfArms();
}
