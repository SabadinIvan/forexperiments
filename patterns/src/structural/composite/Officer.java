package structural.composite;

public class Officer implements MilitaryUnit {
    private final String name;

    public Officer(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println(name + " отдает приказ");
    }

    @Override
    public String getName() {
        return name;
    }
}
