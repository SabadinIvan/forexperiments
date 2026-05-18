package generating.abstractfactory.crew.ship;

import generating.abstractfactory.crew.Cap;
import generating.abstractfactory.crew.CrewFactory;
import generating.abstractfactory.crew.Navigator;
import generating.abstractfactory.crew.Signalman;

public class ShipCrewFactory implements CrewFactory {
    @Override
    public Cap createCap() {
        return new ShipCap();
    }

    @Override
    public Navigator createNavigator() {
        return new ShipNavigator();
    }

    @Override
    public Signalman createSignalman() {
        return new ShipSignalman();
    }
}
