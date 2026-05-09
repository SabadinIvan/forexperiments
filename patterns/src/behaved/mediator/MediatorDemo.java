package behaved.mediator;

public class MediatorDemo {

    public static void main(String[] args) {
        Button button = new Button(null);
        TextField textField = new TextField(null);
        ListBox listBox = new ListBox(null);

        GuiMediator mediator = new GuiMediator(button, textField, listBox);
        button.mediator = mediator;
        textField.mediator = mediator;
        listBox.mediator = mediator;

        textField.setText("Hello");
        button.click();
    }
}
