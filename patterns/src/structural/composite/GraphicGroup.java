package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class GraphicGroup implements GraphicElement {

    private final String name;
    private final List<GraphicElement> children = new ArrayList<>();

    public GraphicGroup(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing group: " + name);
        for (GraphicElement element : children) {
            element.draw();
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(GraphicElement element) {
        children.add(element);
    }

    @Override
    public void remove(GraphicElement element) {
        children.remove(element);
    }

    @Override
    public List<GraphicElement> getChildren() {
        return new ArrayList<>(children);
    }
}
