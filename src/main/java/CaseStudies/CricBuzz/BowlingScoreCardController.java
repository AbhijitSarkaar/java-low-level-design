package CaseStudies.CricBuzz;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BowlingScoreCardController {
    Map<UUID, BowlingScoreCard> bowlingScoreCards;

    public BowlingScoreCardController() {
        this.bowlingScoreCards = new HashMap<>();
    }

    public void addScoreCard(UUID playerId, BowlingScoreCard bowlingScoreCard) {
        bowlingScoreCards.put(playerId, bowlingScoreCard);
    }

    public BowlingScoreCard getScoreCard(UUID playerId) {
        return bowlingScoreCards.get(playerId);
    }
}
