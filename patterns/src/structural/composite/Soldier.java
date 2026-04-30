package structural.composite;

public class Soldier implements MilitaryUnit {

    private final String name;

    public Soldier(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println(name + " выполняет приказ");
    }

    @Override
    public String getName() {
        return name;
    }
}
