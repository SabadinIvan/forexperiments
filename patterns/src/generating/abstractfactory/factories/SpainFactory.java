package generating.abstractfactory.factories;

import generating.abstractfactory.attributes.*;

public class SpainFactory implements CountryFactory {
    @Override
    public FlagOfCountry createFlag() {
        return new FlagOfSpain();
    }

    @Override
    public AnthemOfCountry createAnthem() {
        return new AnthemOfSpain();
    }

    @Override
    public CoatOfArmsOfCountry createCoatOfArms() {
        return new CoatOfArmsOfSpain();
    }
}
