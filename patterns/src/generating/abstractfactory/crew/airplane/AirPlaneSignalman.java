package generating.abstractfactory.crew.airplane;

import generating.abstractfactory.crew.Signalman;

public class AirPlaneSignalman implements Signalman {
    @Override
    public void contact() {
        System.out.println("Signalman contact with airport control town");
    }
}
