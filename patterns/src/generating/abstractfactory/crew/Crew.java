package generating.abstractfactory.crew;

public class Crew {
    private final Cap cap;
    private final Navigator navigator;
    private final Signalman signalman;

    public Crew(CrewFactory factory) {
        this.cap = factory.createCap();
        this.navigator = factory.createNavigator();
        this.signalman = factory.createSignalman();
    }

    public void crewDoesAction() {
        cap.manage();
        navigator.navigate();
        signalman.contact();
    }
}
