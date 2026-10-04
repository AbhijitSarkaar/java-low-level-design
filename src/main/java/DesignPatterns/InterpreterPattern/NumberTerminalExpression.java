package DesignPatterns.InterpreterPattern;

public class NumberTerminalExpression implements AbstractExpression {

    String numExpr;

    public NumberTerminalExpression(String numExpr) {
        this.numExpr = numExpr;
    }

    @Override
    public Integer interpret(Context context) {
        return context.get(numExpr);
    }
}
