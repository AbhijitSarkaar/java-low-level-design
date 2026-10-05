package CaseStudies.PaymentGateway.user;

public class UserController {
    UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public void addUser(UserDo userDo) {
        userService.addUser(userDo);
    }

    public UserDo getUser(int userId) {
        return userService.getUser(userId);
    }
}
