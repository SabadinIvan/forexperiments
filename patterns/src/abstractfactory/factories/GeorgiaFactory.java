package abstractfactory.factories;

import abstractfactory.attributes.*;

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
