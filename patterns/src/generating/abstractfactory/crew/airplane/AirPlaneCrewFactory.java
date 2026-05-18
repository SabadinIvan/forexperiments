package generating.abstractfactory.crew.airplane;

import generating.abstractfactory.crew.Cap;
import generating.abstractfactory.crew.CrewFactory;
import generating.abstractfactory.crew.Navigator;
import generating.abstractfactory.crew.Signalman;

public class AirPlaneCrewFactory implements CrewFactory {
    @Override
    public Cap createCap() {
        return new AirPlainCap();
    }

    @Override
    public Navigator createNavigator() {
        return new AirPlaneNavigator();
    }

    @Override
    public Signalman createSignalman() {
        return new AirPlaneSignalman();
    }
}
