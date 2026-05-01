package structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + ": $" + pizza.getCost());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + ": $" + pizza.getCost());

        pizza = new PepperoniDecorator(pizza);
        System.out.println(pizza.getDescription() + ": $" + pizza.getCost());

        pizza = new TomatoDecorator(pizza);
        System.out.println(pizza.getDescription() + ": $" + pizza.getCost());
    }
}
