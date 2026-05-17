package generating.factorymethod.interpreter;

public class FrenchInterpreterFactory implements InterpreterFactory {
    @Override
    public Interpreter createInterpreter() {
        return new FrenchInterpreter();
    }
}
