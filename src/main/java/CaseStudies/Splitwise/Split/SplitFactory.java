package CaseStudies.Splitwise.Split;

public class SplitFactory {
    public static SplitStrategy getSplitStrategy(SplitType splitType) {
        if (splitType == SplitType.EQUAL) {
            return new EqualSplitStrategy();
        }
        else {
            return new NullSplitStrategy();
        }
    }
}
