package CaseStudies.PaymentGateway.transaction;

import CaseStudies.PaymentGateway.Processor;
import CaseStudies.PaymentGateway.instrument.InstrumentController;
import CaseStudies.PaymentGateway.instrument.InstrumentDo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class TransactionService {
    InstrumentController instrumentController;
    Map<Integer, List<Transaction>> txnHistory;
    Processor paymentProcessor;


    public TransactionService(InstrumentController instrumentController) {
        this.instrumentController = instrumentController;
        this.txnHistory = new HashMap<>();
        paymentProcessor = new Processor();
    }

    void makePayment(int senderId, int receiverId, int debitInstrumentId, int creditInstrumentId, int amount) {
        InstrumentDo debitInstrument = instrumentController.getInstrument(senderId, debitInstrumentId);
        InstrumentDo creditInstrument = instrumentController.getInstrument(receiverId, creditInstrumentId);

        paymentProcessor.processPayment(debitInstrument, creditInstrument);

        Transaction transaction = new Transaction();
        transaction.setTxnId(ThreadLocalRandom.current().nextInt(1, 100));
        transaction.setAmount(amount);
        transaction.setSenderId(senderId);
        transaction.setReceiverId(receiverId);
        transaction.setDebitInstrumentId(debitInstrumentId);
        transaction.setCreditInstrumentId(creditInstrumentId);
        transaction.setTransactionStatus(TransactionStatus.SUCCESS);

        List<Transaction> senderTransactions = txnHistory.get(senderId);
        if(senderTransactions == null) {
            senderTransactions = new ArrayList<>();
            txnHistory.put(senderId, senderTransactions);
        }
        senderTransactions.add(transaction);

        List<Transaction> receiverTransactions = txnHistory.get(receiverId);
        if(receiverTransactions == null) {
            receiverTransactions = new ArrayList<>();
            txnHistory.put(receiverId, receiverTransactions);
        }
        receiverTransactions.add(transaction);
    }

    List<TransactionDo> getTransactionHistory(int userId) {
        List<Transaction> transactions = txnHistory.get(userId);
        List<TransactionDo> transactionDos = new ArrayList<>();
        for(Transaction transaction: transactions) {
            TransactionDo transactionDo = new TransactionDo();
            transactionDo.setTxnId(transaction.getTxnId());
            transactionDo.setAmount(transaction.getAmount());
            transactionDo.setSenderId(transaction.getSenderId());
            transactionDo.setReceiverId(transaction.getReceiverId());
            transactionDo.setDebitInstrumentId(transaction.getDebitInstrumentId());
            transactionDo.setCreditInstrumentId(transaction.getCreditInstrumentId());
            transactionDo.setTransactionStatus(transaction.getTransactionStatus());
            transactionDos.add(transactionDo);
        }
        return transactionDos;
    }
}
