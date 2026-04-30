package structural.composite;

import java.util.List;

public interface GraphicElement {
    void draw();
    String getName();
    default void add(GraphicElement element) {
        throw new UnsupportedOperationException("Cannot add to a leaf");
    }
    default void remove(GraphicElement element) {
        throw new UnsupportedOperationException("Cannot remove from a leaf");
    }
    default List<GraphicElement> getChildren() {
        throw new UnsupportedOperationException("Leaf has no children");
    }
}
