package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class MilitaryGroup implements MilitaryUnit {

    private final String name;
    private final List<MilitaryUnit> children = new ArrayList<>();

    public MilitaryGroup(String name) {
        this.name = name;
    }

    @Override
    public void add(MilitaryUnit unit) {
        children.add(unit);
    }

    @Override
    public void remove(MilitaryUnit unit) {
        children.remove(unit);
    }

    @Override
    public List<MilitaryUnit> getChildren() {
        return new ArrayList<>(children);
    }

    @Override
    public void execute() {
        System.out.println("Execute group: " + name);
        for (MilitaryUnit unit : children) {
            unit.execute();
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
