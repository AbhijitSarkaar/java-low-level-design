package DesignPatterns.CompositePattern.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String expr = "2*(1+7)";
        List<Entity> entities = new ArrayList<>();
        Arrays.stream(expr.split(""))
                .toList()
                .forEach(s -> {
            try {
                entities.add(new Number(Integer.parseInt(s)));
            } catch (Exception exception) {
                entities.add(new Operand(new Number(1), new Number(1), Operation.ADD));
            }
        });
        entities.forEach(e -> e.compute());
        Operand additionExpr = new Operand(new Number(1), new Number(7), Operation.ADD);
        Operand multiplicationExpr = new Operand(new Number(2), additionExpr, Operation.MULTIPLY);
        System.out.println(multiplicationExpr.compute());
    }
}
