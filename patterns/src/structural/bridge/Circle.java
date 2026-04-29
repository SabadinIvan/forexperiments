package structural.bridge;

public class Circle extends Shape {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.print("Рисуем круг радиусом " + radius + " с цветом: ");
        color.applyColor();
    }
}
