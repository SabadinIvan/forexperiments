package generating.abstractfactory.crew.ship;

import generating.abstractfactory.crew.Signalman;

public class ShipSignalman implements Signalman {
    @Override
    public void contact() {
        System.out.println("Ship signalman contact with sea port");
    }
}
