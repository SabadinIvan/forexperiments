package structural.composite;

public class Circle implements GraphicElement {

    private final String name;

    public Circle(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle: " + name);
    }

    @Override
    public String getName() {
        return name;
    }
}
