package CaseStudies.Splitwise.Split;

import CaseStudies.Splitwise.Entity.User;

import java.util.List;

public interface SplitStrategy {
    List<Split> compute(int totalAmount, List<User> users);
}
