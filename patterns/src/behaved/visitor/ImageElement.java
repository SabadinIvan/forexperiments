package behaved.visitor;

public class ImageElement implements DocumentElement {

    private final String url;
    private final int width;
    private final  int height;

    public ImageElement(String url, int width, int height) {
        this.url = url;
        this.width = width;
        this.height = height;
    }

    public String getUrl() { return url; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
