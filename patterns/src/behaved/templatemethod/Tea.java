package behaved.templatemethod;

public class Tea extends Beverage {

    @Override
    void brew() {
        System.out.println("Заварить чай кипятком");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавить лимон");
    }
}
