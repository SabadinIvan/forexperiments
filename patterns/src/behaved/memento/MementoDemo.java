package behaved.memento;

public class MementoDemo {

    public static void main(String[] args) {
        TextDocument document = new TextDocument();
        UndoManager undoManager = new UndoManager();

        // Исходное состояние
        System.out.println("Начальное состояние: " + document);

        // Действие 1: добавляем текст
        document.addText("Привет, Мир!");
        System.out.println(document);

        // Сохраняем состояние после первого действия
        undoManager.saveSnapshot(document.saveState());

        // Действие 2: перемещаем курсор и добавляем ещё текст
        document.moveCursor(5);
        document.addText(" Это тест.");
        System.out.println(document);

        // Сохраняем состояние после второго действия
        undoManager.saveSnapshot(document.saveState());

        // Действие 3: отменяем последнее действие
        DocumentMemento previousState = undoManager.undo();
        if (previousState != null) {
            document.restoreState(previousState);
        }
        System.out.println("После отмены: " + document);

        // Ещё одна отмена
        previousState = undoManager.undo();
        if (previousState != null) {
            document.restoreState(previousState);
        }
        System.out.println("После второй отмены: " + document);
    }
}
