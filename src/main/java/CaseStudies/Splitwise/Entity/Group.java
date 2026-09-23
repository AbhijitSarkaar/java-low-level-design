package CaseStudies.Splitwise.Entity;

import CaseStudies.Splitwise.Controller.BalanceSheetController;
import CaseStudies.Splitwise.Controller.ExpenseController;
import CaseStudies.Splitwise.Split.Split;
import CaseStudies.Splitwise.Split.SplitType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Group {

    UUID groupId;
    List<User> members;
    List<Expense> expenses;
    ExpenseController expenseController;

    public Group() {
        this.groupId = UUID.randomUUID();
        this.members = new ArrayList<>();
        this.expenses = new ArrayList<>();
        this.expenseController = new ExpenseController(new BalanceSheetController());
    }

    public void addUser(User user) {
        members.add(user);
    }

    public UUID getGroupId() {
        return groupId;
    }

    public void displayMembers() {
        for(User member: members) {
            System.out.println(member.getUserId());
            System.out.println(member.getUserName());
        }
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public Expense createExpense(int amount, UUID userId, SplitType splitType, List<Split> splits) {
        return expenseController.createExpense(amount, userId, splitType, splits);
    }

    public BalanceSheetController getBalanceSheetController() {
        return expenseController.getBalanceSheetController();
    }

}
