package CaseStudies.PaymentGateway.transaction;

import java.util.List;

public class TransactionController {
    TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    public void makePayment(int senderId, int receiverId, int debitInstrumentId, int creditInstrumentId, int amount) {
        transactionService.makePayment(
                senderId, receiverId, debitInstrumentId, creditInstrumentId, amount
        );
    }

    public List<TransactionDo> getTransactionHistory(int userId) {
        return transactionService.getTransactionHistory(userId);
    }
}
