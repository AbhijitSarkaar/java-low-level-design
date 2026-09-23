package CaseStudies.Splitwise;

import CaseStudies.Splitwise.Controller.GroupController;
import CaseStudies.Splitwise.Controller.UserController;

public class SplitWiseApp {
    UserController userController;
    GroupController groupController;

    public SplitWiseApp() {
        this.userController = new UserController();
        this.groupController = new GroupController();
    }

    public UserController getUserController() {
        return userController;
    }

    public GroupController getGroupController() {
        return groupController;
    }
}
