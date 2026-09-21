package DesignPatterns.CompositePattern.Calculator;

public class Operand implements Entity {

    Entity leftExpression;
    Entity rightExpression;
    Operation operation;

    public Operand(Entity leftExpression, Entity rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int compute() {
        int value = 0;
        switch (operation) {
            case ADD:
                value = leftExpression.compute() + rightExpression.compute();
                break;
            case SUBTRACT:
                value = leftExpression.compute() - rightExpression.compute();
                break;
            case MULTIPLY:
                value = leftExpression.compute() * rightExpression.compute();
                break;
            case DIVIDE:
                value = leftExpression.compute() / rightExpression.compute();
                break;
        }
        return value;
    }
}
