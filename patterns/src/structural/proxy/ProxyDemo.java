package structural.proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        Image image1 = new ImageProxy("photo1.jpg");
        Image image2 = new ImageProxy("photo2.jpg");

        System.out.println("Объекты прокси созданы, но изображения ещё не загружены\n");

        image1.display();
        System.out.println();

        image2.display();
        System.out.println();

        image1.display();
        image2.display();
    }
}
