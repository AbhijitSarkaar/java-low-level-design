package CaseStudies.CricBuzz;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BattingScoreCardController {
    Map<UUID, BattingScoreCard> battingScoreCards;

    public BattingScoreCardController() {
        this.battingScoreCards = new HashMap<>();
    }

    public void addScoreCard(UUID playerID, BattingScoreCard scoreCard) {
        battingScoreCards.put(playerID, scoreCard);
    }

    public BattingScoreCard getScoreCard(UUID playerId) {
        return battingScoreCards.get(playerId);
    }
}
