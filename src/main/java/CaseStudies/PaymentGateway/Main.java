package CaseStudies.PaymentGateway;

import CaseStudies.PaymentGateway.instrument.InstrumentController;
import CaseStudies.PaymentGateway.instrument.InstrumentDo;
import CaseStudies.PaymentGateway.instrument.InstrumentType;
import CaseStudies.PaymentGateway.transaction.TransactionController;
import CaseStudies.PaymentGateway.transaction.TransactionDo;
import CaseStudies.PaymentGateway.transaction.TransactionService;
import CaseStudies.PaymentGateway.user.UserController;
import CaseStudies.PaymentGateway.user.UserDo;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        UserController userController = new UserController();
        UserDo user1 = new UserDo();
        user1.setUserId(1);
        user1.setName("user1");
        user1.setEmail("user1@email.com");
        userController.addUser(user1);

        UserDo user2 = new UserDo();
        user2.setUserId(2);
        user2.setName("user2");
        user2.setEmail("user2@email.com");
        userController.addUser(user2);

        InstrumentDo bankInstrumentDo = new InstrumentDo();
        bankInstrumentDo.setInstrumentId(ThreadLocalRandom.current().nextInt(1,100));
        bankInstrumentDo.setBankAccountNumber("112233");
        bankInstrumentDo.setIfscCode("1234");
        bankInstrumentDo.setInstrumentType(InstrumentType.BANK);
        bankInstrumentDo.setUserId(user1.getUserId());

        InstrumentDo cardInstrumentDo = new InstrumentDo();
        cardInstrumentDo.setInstrumentId(ThreadLocalRandom.current().nextInt(1, 100));
        cardInstrumentDo.setCardNumber(112233);
        cardInstrumentDo.setCvvNumber(123);
        cardInstrumentDo.setInstrumentType(InstrumentType.CARD);
        cardInstrumentDo.setUserId(user2.getUserId());

        InstrumentController instrumentController = new InstrumentController();
        instrumentController.addInstrument(bankInstrumentDo);
        instrumentController.addInstrument(cardInstrumentDo);

        TransactionService transactionService = new TransactionService(instrumentController);
        TransactionController transactionController = new TransactionController(transactionService);

        transactionController.makePayment(
                user1.getUserId(),
                user2.getUserId(),
                bankInstrumentDo.getInstrumentId(),
                cardInstrumentDo.getInstrumentId(),
                1000
        );

        List<TransactionDo> transactions1 = transactionController.getTransactionHistory(user1.getUserId());
        for(TransactionDo transactionDo: transactions1) {
            System.out.println(transactionDo.toString());
        }

        List<TransactionDo> transactions2 = transactionController.getTransactionHistory(user2.getUserId());
        for(TransactionDo transactionDo: transactions2) {
            System.out.println(transactionDo.toString());
        }

    }
}
