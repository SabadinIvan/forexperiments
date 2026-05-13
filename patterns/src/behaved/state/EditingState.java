package behaved.state;

public class EditingState implements EditorState {
    @Override
    public void handle(TextEditor context) {
        System.out.println("Вы находитесь в режиме редактирования. Вносите изменения в текст.");
        System.out.println("Переход в режим навигации.");
        context.setState(new NavigatingState());
    }
}
