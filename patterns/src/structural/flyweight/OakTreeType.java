package structural.flyweight;

public class OakTreeType implements TreeType {
    private final String color;
    private final String texture;

    public OakTreeType(String color, String texture) {
        this.color = color;
        this.texture = texture;
    }

    @Override
    public void draw(int x, int y, int width, int height) {
        System.out.println("Рисуем дуб: цвет=" + color +
                ", текстура=" + texture +
                " на координатах (" + x + "," + y +
                "), размер " + width + "x" + height);
    }
}
