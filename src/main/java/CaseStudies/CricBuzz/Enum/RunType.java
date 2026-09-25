package CaseStudies.CricBuzz.Enum;

public enum RunType {
    ONE(1),
    TWO(2),
    FOUR(4),
    SIX(6),
    NO_BALL_RUN(1),
    WIDE_RUN(1);

    private final int value;

    RunType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
