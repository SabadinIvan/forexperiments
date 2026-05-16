package behaved.visitor;

import java.util.List;

public class TableElement implements DocumentElement {
    private final List<List<String>> data;

    public TableElement(List<List<String>> data) {
        this.data = data;
    }

    public List<List<String>> getData() {
        return data;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
