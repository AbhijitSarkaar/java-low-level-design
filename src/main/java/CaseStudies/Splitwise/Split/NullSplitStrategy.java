package CaseStudies.Splitwise.Split;

import CaseStudies.Splitwise.Entity.User;

import java.util.List;

public class NullSplitStrategy implements SplitStrategy {
    @Override
    public List<Split> compute(int totalAmount, List<User> users) {
        return List.of();
    }
}
