package generating.abstractfactory.crew.airplane;

import generating.abstractfactory.crew.Navigator;

public class AirPlaneNavigator implements Navigator {
    @Override
    public void navigate() {
        System.out.println("The navigator assist to airplane cap");
    }
}
