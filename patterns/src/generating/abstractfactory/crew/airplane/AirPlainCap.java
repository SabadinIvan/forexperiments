package generating.abstractfactory.crew.airplane;

import generating.abstractfactory.crew.Cap;

public class AirPlainCap implements Cap {
    @Override
    public void manage() {
        System.out.println("The cap controls the plain!");
    }
}
