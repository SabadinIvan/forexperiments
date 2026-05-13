package behaved.state;

public class StateDemo {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        for (int i = 0; i < 6; i++) {
            editor.performAction();
            System.out.println("---------------------------");
        }
    }
}
