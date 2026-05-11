package behaved.memento;

public class TextDocument {
    private String content = "";
    private int cursorPosition = 0;

    public void  addText(String text) {
        content += text;
        cursorPosition += text.length();
        System.out.println("Добавлен текст : " + text);
    }

    public void moveCursor(int position) {
        if (position >= 0 && position <= content.length()) {
            cursorPosition = position;
            System.out.println("Курсор перемещшен на позицию : " + position);
        }
    }

    public DocumentMemento saveState() {
        System.out.println("Создан снимок текущего документа");
        return new DocumentMemento(content, cursorPosition);
    }

    public void restoreState(DocumentMemento memento) {
        content = memento.getContent();
        cursorPosition = memento.getCursorPosition();
        System.out.println("Состояние документа восстановлено");
    }

    @Override
    public String toString() {
        return "TextDocument{" +
                "content='" + content + '\'' +
                ", cursorPosition=" + cursorPosition +
                '}';
    }
}
