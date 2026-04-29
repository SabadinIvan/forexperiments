package structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color blue = new BlueColor();

        Shape redCircle = new Circle(red, 5.0);
        Shape blueCircle = new Circle(blue, 12.0);
        Shape redSquare = new Square(red, 8.0);
        Shape blueSquare = new Square(blue, 4.0);

        redCircle.draw();
        blueCircle.draw();
        redSquare.draw();
        blueSquare.draw();
    }
}
