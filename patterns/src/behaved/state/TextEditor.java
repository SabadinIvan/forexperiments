package behaved.state;

public class TextEditor {
    private EditorState currentState;

    public TextEditor() {
        this.currentState = new EditingState();
    }

    public void setState(EditorState state) {
        this.currentState = state;
    }

    public void performAction() {
        currentState.handle(this);
    }
}
