package DesignPatterns.InterpreterPattern;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Integer> map;

    public Context() {
        this.map = new HashMap<>();
    }

    void put(String str, Integer num) {
        map.put(str, num);
    }

    Integer get(String str) {
        return map.get(str);
    }
}
