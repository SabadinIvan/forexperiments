package behaved.templatemethod;

abstract class Beverage {

    // Шаблонный метод — определяет структуру алгоритма
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Абстрактные методы — должны быть реализованы в подклассах
    abstract void brew();
    abstract void addCondiments();

    // Hook‑методы — имеют реализацию по умолчанию, могут быть переопределены
    void boilWater() {
        System.out.println("Вскипятить воду");
    }

    void pourInCup() {
        System.out.println("Налить в чашку");
    }
}
