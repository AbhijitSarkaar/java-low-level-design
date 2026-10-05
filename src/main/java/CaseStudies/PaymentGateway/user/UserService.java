package CaseStudies.PaymentGateway.user;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> users = new ArrayList<>();

    public void addUser(UserDo userDo) {
        users.add(userDoToUser(userDo));
    }

    public UserDo getUser(int userId) {
        for(User user: users) {
            if(user.getUserId() == userId) return userToUserDo(user);
        }
        return null;
    }

    private User userDoToUser(UserDo userDo) {
        User user = new User();
        user.setUserId(userDo.getUserId());
        user.setName(userDo.getName());
        user.setEmail(userDo.getEmail());
        return user;
    }

    private UserDo userToUserDo(User user) {
        UserDo userDo = new UserDo();
        userDo.setUserId(user.getUserId());
        userDo.setName(user.getName());
        userDo.setEmail(user.getEmail());
        return userDo;
    }
}
