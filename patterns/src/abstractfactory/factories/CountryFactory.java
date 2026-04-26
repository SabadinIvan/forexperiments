package abstractfactory.factories;

import abstractfactory.attributes.AnthemOfCountry;
import abstractfactory.attributes.CoatOfArmsOfCountry;
import abstractfactory.attributes.FlagOfCountry;

public interface CountryFactory {
    FlagOfCountry createFlag();
    AnthemOfCountry createAnthem();
    CoatOfArmsOfCountry createCoatOfArms();
}
