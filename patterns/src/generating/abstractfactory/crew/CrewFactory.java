package generating.abstractfactory.crew;

public interface CrewFactory {
    Cap createCap();
    Navigator createNavigator();
    Signalman createSignalman();
}
