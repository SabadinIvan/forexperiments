package generating.factorymethod.interpreter;

public class FrenchInterpreter implements Interpreter {
    @Override
    public void translate() {
        System.out.println("French interpreter translates some text!");
    }
}
