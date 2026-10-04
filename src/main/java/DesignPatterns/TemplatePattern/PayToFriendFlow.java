package DesignPatterns.TemplatePattern;

public class PayToFriendFlow extends PaymentFlow {
    @Override
    void validateAmount() {
        System.out.println("PayToFriendFlow.validateAmount()");
    }

    @Override
    void calculateFees() {
        System.out.println("PayToFriendFlow.calculateFees()");
    }

    @Override
    void creditAmount() {
        System.out.println("PayToFriendFlow.creditAmount()");
    }

    @Override
    void debitAmount() {
        System.out.println("PayToFriendFlow.debitAmount()");
    }
}
