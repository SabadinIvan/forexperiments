package behaved.visitor;

public interface DocumentVisitor {
    void visit(TextElement text);
    void visit(ImageElement image);
    void visit(TableElement table);
}
