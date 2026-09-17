package CaseStudies.SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public int fetchNumber() {
        return ThreadLocalRandom.current().nextInt(1,7);
    }
}
