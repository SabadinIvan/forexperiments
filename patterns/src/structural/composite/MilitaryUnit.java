package structural.composite;

import java.util.List;

public interface MilitaryUnit {
    void execute();
    String getName();
    default void add(MilitaryUnit unit) {
        throw new UnsupportedOperationException("Нет возможности добавить служивого");
    }
    default void remove(MilitaryUnit unit) {
        throw new UnsupportedOperationException("Нет возможности удалить служивого");
    }
    default List<MilitaryUnit> getChildren() {
        throw new UnsupportedOperationException("Служивый не имеет подразделений");
    }
}
