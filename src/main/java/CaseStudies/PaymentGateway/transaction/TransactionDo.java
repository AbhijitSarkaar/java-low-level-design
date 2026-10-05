package CaseStudies.PaymentGateway.transaction;

public class TransactionDo {
    int txnId;
    int amount;
    int senderId;
    int receiverId;
    int debitInstrumentId;
    int creditInstrumentId;
    TransactionStatus transactionStatus;

    public int getTxnId() {
        return txnId;
    }

    public void setTxnId(int txnId) {
        this.txnId = txnId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public int getDebitInstrumentId() {
        return debitInstrumentId;
    }

    public void setDebitInstrumentId(int debitInstrumentId) {
        this.debitInstrumentId = debitInstrumentId;
    }

    public int getCreditInstrumentId() {
        return creditInstrumentId;
    }

    public void setCreditInstrumentId(int creditInstrumentId) {
        this.creditInstrumentId = creditInstrumentId;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    @Override
    public String toString() {
        return "TransactionDo{" +
                "txnId=" + txnId +
                ", amount=" + amount +
                ", senderId=" + senderId +
                ", receiverId=" + receiverId +
                ", debitInstrumentId=" + debitInstrumentId +
                ", creditInstrumentId=" + creditInstrumentId +
                ", transactionStatus=" + transactionStatus +
                '}';
    }
}
