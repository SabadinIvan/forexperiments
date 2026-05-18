package generating.abstractfactory.countries.factories;

import generating.abstractfactory.countries.attributes.*;

public class GeorgiaFactory implements CountryFactory {
    @Override
    public FlagOfCountry createFlag() {
        return new FlagOfGeorgia();
    }

    @Override
    public AnthemOfCountry createAnthem() {
        return new AnthemOfGeorgia();
    }

    @Override
    public CoatOfArmsOfCountry createCoatOfArms() {
        return new CoatOfArmsOfGeorgia();
    }
}
