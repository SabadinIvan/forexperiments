package behaved.visitor;

public interface DocumentElement {
    void accept(DocumentVisitor visitor);
}
