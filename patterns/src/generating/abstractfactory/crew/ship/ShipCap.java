package generating.abstractfactory.crew.ship;

import generating.abstractfactory.crew.Cap;

public class ShipCap implements Cap {
    @Override
    public void manage() {
        System.out.println("The shop cap control the shipping");
    }
}
