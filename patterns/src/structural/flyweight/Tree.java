package structural.flyweight;

public class Tree {
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    private final TreeType type;

    public Tree(int x, int y, int width, int height, TreeType type) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.type = type;
    }

    public void draw() {
        type.draw(x, y, width, height);
    }
}
