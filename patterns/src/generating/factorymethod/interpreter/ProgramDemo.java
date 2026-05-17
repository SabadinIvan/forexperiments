package generating.factorymethod.interpreter;

public class ProgramDemo {

    public static void main(String[] args) {
        InterpreterFactory interpreterFactory = createInterpreterFactoryDyLanguage("Italian");
        Interpreter interpreter = interpreterFactory.createInterpreter();
        interpreter.translate();

        Interpreter interpreter1 = createInterpreterByLanguage("Spain");
        interpreter1.translate();
    }
    
    public static InterpreterFactory createInterpreterFactoryDyLanguage(String language) {
        return switch (language.toLowerCase()) {
            case "spain" -> new SpainInterpreterFactory();
            case "italian" -> new ItalianInterpreterFactory();
            case "french" -> new FrenchInterpreterFactory();
            default -> throw  new RuntimeException("We don't have interpreter from + " + language);
        };
    }

    public static Interpreter createInterpreterByLanguage(String language) {
        return switch (language.toLowerCase()) {
            case "spain" -> new SpainInterpreterFactory().createInterpreter();
            case "italian" -> new ItalianInterpreterFactory().createInterpreter();
            case "french" -> new FrenchInterpreterFactory().createInterpreter();
            default -> throw new RuntimeException("We don't have interpreter from + " + language);
        };
    }
}
