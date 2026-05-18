package generating.abstractfactory.crew;

import generating.abstractfactory.crew.airplane.AirPlaneCrewFactory;
import generating.abstractfactory.crew.ship.ShipCrewFactory;

public class CrewDemo {
    public static void main(String[] args) {
        Crew airCrew = new Crew(new AirPlaneCrewFactory());
        Crew shipCrew = new Crew(new ShipCrewFactory());

        airCrew.crewDoesAction();
        shipCrew.crewDoesAction();
    }
}
