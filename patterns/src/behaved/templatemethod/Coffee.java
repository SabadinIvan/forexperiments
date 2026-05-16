package behaved.templatemethod;

public class Coffee extends Beverage {

    @Override
    void brew() {
        System.out.println("Пропустить воду через молотый кофе");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавить сахар и молоко");
    }
}
