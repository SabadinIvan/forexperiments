package behaved.memento;

import java.util.Stack;

public class UndoManager {
    private final Stack<DocumentMemento> history = new Stack<>();

    public void saveSnapshot(DocumentMemento snapshot) {
        history.push(snapshot);
        System.out.println("Снимок сохранен в историю");
    }

    public DocumentMemento undo() {
        if (!history.isEmpty()) {
            DocumentMemento lastSnapshot = history.pop();
            System.out.println("Выполнена отмена последнего действия");
            return lastSnapshot;
        } else {
            System.out.println("Нкт действий для отмены");
            return null;
        }
    }
}
