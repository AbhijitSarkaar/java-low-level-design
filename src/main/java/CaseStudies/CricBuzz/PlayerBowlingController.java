package CaseStudies.CricBuzz;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PlayerBowlingController {
    Deque<Player> bowlers;

    public PlayerBowlingController(List<Player> players) {
        this.bowlers = new LinkedList<>();
        bowlers.addAll(players);
    }

    public Player getNextBowler() {
        Player p = bowlers.poll();
        bowlers.addLast(p);
        return p;
    }
}
