package structural.composite;

public class Subdivision implements MilitaryUnit {

    private final String name;

    public Subdivision(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Подразделение " + name + "проинформировало личный состав и нижестоящие подразделения");
    }

    @Override
    public String getName() {
        return name;
    }
}
