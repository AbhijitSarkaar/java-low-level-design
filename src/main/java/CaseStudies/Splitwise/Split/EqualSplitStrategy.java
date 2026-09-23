package CaseStudies.Splitwise.Split;

import CaseStudies.Splitwise.Entity.User;

import java.util.ArrayList;
import java.util.List;

public class EqualSplitStrategy implements SplitStrategy {
    @Override
    public List<Split> compute(int totalAmount, List<User> users) {
        int amountPerUser = totalAmount / users.size();
        List<Split> splits = new ArrayList<>();
        for(User user: users) {
            splits.add(new Split(user, amountPerUser));
        }
        return splits;
    }
}
