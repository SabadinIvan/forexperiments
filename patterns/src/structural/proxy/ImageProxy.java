package structural.proxy;

public class ImageProxy implements Image {
    private RealImage realImage;
    private final String filename;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            this.realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
