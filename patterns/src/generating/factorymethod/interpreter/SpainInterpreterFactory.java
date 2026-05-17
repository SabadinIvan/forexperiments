package generating.factorymethod.interpreter;

public class SpainInterpreterFactory implements InterpreterFactory {
    @Override
    public Interpreter createInterpreter() {
        return new SpainInterpreter();
    }
}
