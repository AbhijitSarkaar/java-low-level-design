package CaseStudies.Splitwise.Entity;

import CaseStudies.Splitwise.Split.Split;
import CaseStudies.Splitwise.Split.SplitType;

import java.util.List;
import java.util.UUID;

public class Expense {

    UUID expenseId;
    Integer amount;
    UUID paidBy;
    SplitType splitType;
    List<Split> splits;

    public Expense(Integer amount, UUID paidBy, SplitType splitType, List<Split> splits) {
        this.amount = amount;
        this.paidBy = paidBy;
        this.splitType = splitType;
        this.expenseId = UUID.randomUUID();
        this.splits = splits;
    }
}
