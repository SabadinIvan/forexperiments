package behaved.mediator;

public class ListBox extends Component {
    public ListBox(Mediator mediator) {
        super(mediator);
    }

    public void updateList(String[] items) {
        System.out.println("List updated: " + String.join(", ", items));
    }
}
