package generating.abstractfactory.crew.ship;

import generating.abstractfactory.crew.Navigator;

public class ShipNavigator implements Navigator {
    @Override
    public void navigate() {
        System.out.println("Ship navigator assist to cap");
    }
}
