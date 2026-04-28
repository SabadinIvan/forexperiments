package generating.factorymethod;

public class Spain implements Country{

    @Override
    public void singAnthem() {
        String text = "¡Viva España!...";
        System.out.println(text);
    }
}
