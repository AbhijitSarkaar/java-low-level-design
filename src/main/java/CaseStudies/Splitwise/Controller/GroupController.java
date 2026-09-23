package CaseStudies.Splitwise.Controller;

import CaseStudies.Splitwise.Entity.Expense;
import CaseStudies.Splitwise.Entity.Group;
import CaseStudies.Splitwise.Entity.User;
import CaseStudies.Splitwise.Split.Split;
import CaseStudies.Splitwise.Split.SplitType;

import java.util.*;

public class GroupController {
    Map<UUID, Group> groups;

    public GroupController() {
        this.groups = new HashMap<>();
    }

    public Group createGroup() {
        return new Group();
    }

    public void addUser(UUID groupId, User user) {
        Group group = groups.computeIfAbsent(groupId, k -> new Group());
        group.addUser(user);
    }

    public void displayMembers(UUID groupId) {
        Group group = groups.get(groupId);
        group.displayMembers();
    }

    public Expense createExpense(UUID groupId, int amount, UUID userId, SplitType splitType, List<Split> splits) {
        Group group = groups.computeIfAbsent(groupId, k -> new Group());
        return group.createExpense(amount, userId, splitType, splits);
    }

    public BalanceSheetController getBalanceSheetController(UUID groupId) {
        Group group = groups.get(groupId);
        return group.getBalanceSheetController();
    }

    public void displayBalanceSheet(UUID groupId, UUID userId) {
        BalanceSheetController balanceSheetController = getBalanceSheetController(groupId);
        balanceSheetController.display(userId);
    }

}
