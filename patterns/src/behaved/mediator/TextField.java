package behaved.mediator;

public class TextField extends Component {
    private String text;

    public TextField(Mediator mediator) {
        super(mediator);
    }

    public void setText(String text) {
        this.text = text;
        System.out.println("Text set: " + text);
        mediator.notify(this, "textChanged");
    }

    public String getText() {
        return text;
    }
}
