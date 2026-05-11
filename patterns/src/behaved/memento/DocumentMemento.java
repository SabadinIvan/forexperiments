package behaved.memento;

public class DocumentMemento {
    private final String content;
    private final int cursorPosition;

    public DocumentMemento(String content, int cursorPosition) {
        this.content = content;
        this.cursorPosition = cursorPosition;
    }

    public String getContent() {
        return content;
    }

    public int getCursorPosition() {
        return cursorPosition;
    }
}
