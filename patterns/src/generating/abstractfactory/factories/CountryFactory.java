package generating.abstractfactory.factories;

import generating.abstractfactory.attributes.AnthemOfCountry;
import generating.abstractfactory.attributes.CoatOfArmsOfCountry;
import generating.abstractfactory.attributes.FlagOfCountry;

public interface CountryFactory {
    FlagOfCountry createFlag();
    AnthemOfCountry createAnthem();
    CoatOfArmsOfCountry createCoatOfArms();
}
