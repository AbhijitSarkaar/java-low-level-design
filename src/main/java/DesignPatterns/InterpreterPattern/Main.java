package DesignPatterns.InterpreterPattern;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 2);
        context.put("b", 4);
        context.put("c", 8);
        context.put("d", 16);

        AbstractExpression expression = new SumNonTerminalExpression(
                new MultiplyNonTerminalExpression(
                        new NumberTerminalExpression("a"), new NumberTerminalExpression("b")
                ),
                new MultiplyNonTerminalExpression(
                        new NumberTerminalExpression("c"), new NumberTerminalExpression("d")
                )
        );

        Integer result = expression.interpret(context);
        System.out.println(result);
    }
}
