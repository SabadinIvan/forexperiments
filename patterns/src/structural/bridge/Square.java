package structural.bridge;

public class Square extends Shape {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    void draw() {
        System.out.print("Рисуем квадрат со стороной " + side + " с цветом: ");
        color.applyColor();
    }
}
