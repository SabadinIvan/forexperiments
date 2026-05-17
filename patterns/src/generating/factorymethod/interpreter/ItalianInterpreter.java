package generating.factorymethod.interpreter;

public class ItalianInterpreter implements Interpreter {
    @Override
    public void translate() {
        System.out.println("Italian interpreter translates some text!");
    }
}
