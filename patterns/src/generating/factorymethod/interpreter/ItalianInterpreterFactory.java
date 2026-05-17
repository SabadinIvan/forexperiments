package generating.factorymethod.interpreter;

public class ItalianInterpreterFactory implements InterpreterFactory {
    @Override
    public Interpreter createInterpreter() {
        return new ItalianInterpreter();
    }
}
