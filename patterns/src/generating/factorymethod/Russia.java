package generating.factorymethod;

public class Russia implements Country{

    @Override
    public void singAnthem() {
        String text = "Россия священная наша держава...";
        System.out.println(text);
    }
}
