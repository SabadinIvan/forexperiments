package behaved.mediator;

public class GuiMediator implements Mediator {
    private final Button button;
    private final TextField textField;
    private final ListBox listBox;

    public GuiMediator(Button button, TextField textField, ListBox listBox) {
        this.button = button;
        this.textField = textField;
        this.listBox = listBox;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == button && event.equals("click")) {
            String input = textField.getText();
            listBox.updateList(new String[]{input});
        } else if (sender == textField && event.equals("textChanged")) {
            // Дополнительная логика: например, активировать/деактивировать кнопку
            System.out.println("TextField changed, updating state...");
        }
    }
}
