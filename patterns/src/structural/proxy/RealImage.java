package structural.proxy;

public class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
    }

    private void loadFromDisk(String filename) {
        System.out.println("Загрузка изображения: " + filename);
        try {
            // имитация ресурсоемкости
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Отображение изображения: " + filename);
    }
}
