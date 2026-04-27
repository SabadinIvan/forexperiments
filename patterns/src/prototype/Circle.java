package prototype;

public class Circle extends Shape {
    public int radius;

    public Circle() {}

    public Circle(Circle circle) {
        super(circle);
        if (circle != null) {
            this.radius = circle.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle circle) || !super.equals(obj)) return false;
        return circle.radius == radius;
    }
}
