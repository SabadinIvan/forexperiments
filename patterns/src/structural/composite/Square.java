package structural.composite;

public class Square implements GraphicElement {

    private final String name;

    public Square(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing square: " + name);
    }

    @Override
    public String getName() {
        return name;
    }
}
