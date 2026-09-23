package CaseStudies.Splitwise;

import CaseStudies.Splitwise.Controller.GroupController;
import CaseStudies.Splitwise.Controller.UserController;
import CaseStudies.Splitwise.Entity.Group;
import CaseStudies.Splitwise.Entity.User;
import CaseStudies.Splitwise.Split.Split;
import CaseStudies.Splitwise.Split.SplitFactory;
import CaseStudies.Splitwise.Split.SplitType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SplitWiseApp splitWiseApp = new SplitWiseApp();
        List<User> users = setUpUsers(splitWiseApp);

        List<Split> splits = SplitFactory.getSplitStrategy(SplitType.EQUAL).compute(400, users);
        GroupController groupController = splitWiseApp.getGroupController();
        Group group = groupController.createGroup();
        groupController.createExpense(group.getGroupId(), 400, users.get(0).getUserId(), SplitType.EQUAL, splits);
        groupController.createExpense(group.getGroupId(), 400, users.get(1).getUserId(), SplitType.EQUAL, splits);

        for(User user: users) {
            System.out.println("-------------------");
            groupController.displayBalanceSheet(group.getGroupId(), user.getUserId());
            System.out.println("-------------------");
        }
    }

    static List<User> setUpUsers(SplitWiseApp splitWiseApp) {
        UserController userController = splitWiseApp.getUserController();

        List<User> users = new ArrayList<>();
        users.add(userController.createUser("user1"));
        users.add(userController.createUser("user2"));
        users.add(userController.createUser("user3"));
        users.add(userController.createUser("user4"));

        return users;
    }
}
