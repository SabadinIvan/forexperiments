package behaved.state;

public class ReadingState implements EditorState {
    @Override
    public void handle(TextEditor context) {
        System.out.println("Вы находитесь в режиме чтения. Просматривайте документ.");
        System.out.println("Переход в режим редактирования.");
        context.setState(new EditingState());
    }
}
