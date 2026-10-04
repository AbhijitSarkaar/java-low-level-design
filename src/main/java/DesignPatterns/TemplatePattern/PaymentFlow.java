package DesignPatterns.TemplatePattern;

public abstract class PaymentFlow {

    abstract void validateAmount();
    abstract void calculateFees();
    abstract void creditAmount();
    abstract void debitAmount();

    public final void send() {
        validateAmount();
        debitAmount();
        calculateFees();
        creditAmount();
    }

}
