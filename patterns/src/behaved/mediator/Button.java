package behaved.mediator;

public class Button extends Component {
    public Button(Mediator mediator) {
        super(mediator);
    }
    public void click() {
        System.out.println("Button clicked");
        mediator.notify(this, "click");
    }
}
