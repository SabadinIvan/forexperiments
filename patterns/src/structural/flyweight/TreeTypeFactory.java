package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {

    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String color, String texture) {
        String key = color + texture;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new OakTreeType(color, texture));
        }
        return treeTypes.get(key);
    }
}
