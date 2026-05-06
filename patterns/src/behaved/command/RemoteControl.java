package behaved.command;

import java.util.Stack;

public class RemoteControl {
    private Command command;
    private final Stack<Command> history = new Stack<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
            history.push(command); // Сохраняем в историю
        }
    }

    public void undoLast() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        }
    }
}
