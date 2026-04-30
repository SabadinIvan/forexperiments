package structural.composite;

public class CompositeDemo {

    public static void main(String[] args) {
        MilitaryUnit soldier_11 = new Soldier("Рядовой Пупкин");
        MilitaryUnit soldier_12 = new Soldier("Рядовой Васичкин");
        MilitaryUnit soldier_13 = new Soldier("Рядовой Баранкин");
        MilitaryUnit soldier_14 = new Soldier("Рядовой Кубышкин");
        MilitaryUnit soldier_15 = new Soldier("Рядовой Симонов");

        MilitaryUnit officer_1 = new Officer("Лейтенант Пупырышкин");

        MilitaryGroup group_1 = new MilitaryGroup("Взвод 1");
        group_1.add(officer_1);
        group_1.add(soldier_11);
        group_1.add(soldier_12);
        group_1.add(soldier_13);
        group_1.add(soldier_14);
        group_1.add(soldier_15);

        group_1.execute();


//        GraphicElement circle_1 = new Circle("circle_1");
//        GraphicElement square_1 = new Square("square_1");
//
//        GraphicGroup group_1 = new GraphicGroup("group_1");
//        group_1.add(circle_1);
//        group_1.add(square_1);
//
//        GraphicElement circle_2 = new Circle("circle_2");
//        GraphicGroup group_2 = new GraphicGroup("group_2");
//        group_2.add(circle_2);
//        group_2.add(group_1);
//
//        group_2.draw();
    }
}
