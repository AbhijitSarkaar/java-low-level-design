package CaseStudies.ATM.AmountWithdrawal;

import CaseStudies.ATM.ATM;

public abstract class CashWithdrawProcessor {
    CashWithdrawProcessor nextCashWithdrawProcessor;

    CashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        this.nextCashWithdrawProcessor = cashWithdrawProcessor;
    }

    public void withDraw(ATM atm, int remainingAmount) {
        if(nextCashWithdrawProcessor != null) {
            nextCashWithdrawProcessor.withDraw(atm, remainingAmount);
        }
    }
}
