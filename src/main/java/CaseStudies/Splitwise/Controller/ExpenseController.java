package CaseStudies.Splitwise.Controller;

import CaseStudies.Splitwise.Entity.Expense;
import CaseStudies.Splitwise.Split.Split;
import CaseStudies.Splitwise.Split.SplitType;

import java.util.List;
import java.util.UUID;

public class ExpenseController {

    BalanceSheetController balanceSheetController;

    public ExpenseController(BalanceSheetController balanceSheetController) {
        this.balanceSheetController = balanceSheetController;
    }

    public Expense createExpense(int amount, UUID userId, SplitType splitType, List<Split> splits) {
        Expense expense = new Expense(amount, userId, splitType, splits);
        balanceSheetController.updateBalanceSheet(userId, splits);
        return expense;
    }

    public BalanceSheetController getBalanceSheetController() {
        return balanceSheetController;
    }
}
