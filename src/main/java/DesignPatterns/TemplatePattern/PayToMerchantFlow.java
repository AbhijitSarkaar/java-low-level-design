package DesignPatterns.TemplatePattern;

public class PayToMerchantFlow extends PaymentFlow {
    @Override
    void validateAmount() {
        System.out.println("PayToMerchantFlow.validateAmount()");
    }

    @Override
    void calculateFees() {
        System.out.println("PayToMerchantFlow.calculateFees()");
    }

    @Override
    void creditAmount() {
        System.out.println("PayToMerchantFlow.creditAmount()");
    }

    @Override
    void debitAmount() {
        System.out.println("PayToMerchantFlow.debitAmount()");
    }
}
