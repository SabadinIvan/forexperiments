package behaved.templatemethod;

public class TemplateMethodDemo {

    public static void main(String[] args) {
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        System.out.println("Приготовление чая:");
        tea.prepareRecipe();

        System.out.println("\nПриготовление кофе:");
        coffee.prepareRecipe();
    }
}
