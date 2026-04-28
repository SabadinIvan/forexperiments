package generating.abstractfactory.factories;

import generating.abstractfactory.attributes.*;

public class RussiaFactory implements CountryFactory {
    @Override
    public FlagOfCountry createFlag() {
        return new FlagOfRussia();
    }

    @Override
    public AnthemOfCountry createAnthem() {
        return new AnthemOfRussia();
    }

    @Override
    public CoatOfArmsOfCountry createCoatOfArms() {
        return new CoatOfArmsOfRussia();
    }
}
