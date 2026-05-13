package behaved.state;

public class NavigatingState implements EditorState {
    @Override
    public void handle(TextEditor context) {
        System.out.println("Вы находитесь в режиме навигации. Просматривайте разделы.");
        System.out.println("Переход в режим чтения.");
        context.setState(new ReadingState());
    }
}
