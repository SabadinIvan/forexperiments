package behaved.visitor;

public class TextElement implements DocumentElement {
    private final String content;

    public TextElement(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
