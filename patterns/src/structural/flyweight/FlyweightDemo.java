package structural.flyweight;

public class FlyweightDemo {

    public static void main(String[] args) {
        Forest forest = new Forest();

        for (int i = 0; i < 1000; i++) {
            TreeType oakType = TreeTypeFactory.getTreeType("коричневый", "грубая");
            forest.plantTree(
                    (int) (Math.random() * 100),
                    (int) (Math.random() * 100),
                    5,
                    10,
                    oakType
            );
        }

        forest.draw();
    }
}
