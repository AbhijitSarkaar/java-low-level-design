package CaseStudies.CricBuzz;

import java.util.UUID;

public class Player {

    UUID playerId;
    Person person;
    BattingScoreCard battingScoreCard;
    BowlingScoreCard bowlingScoreCard;

    public Player(String name) {
        this.person = new Person(name);
        this.battingScoreCard = new BattingScoreCard();
        this.bowlingScoreCard = new BowlingScoreCard();
        playerId = UUID.randomUUID();
    }

    public UUID getPlayerId() {
        return playerId;
    }

    public String getName() {
        return person.getName();
    }

    public BattingScoreCard getBattingScoreCard() {
        return battingScoreCard;
    }

    public void setBattingScoreCard(BattingScoreCard battingScoreCard) {
        this.battingScoreCard = battingScoreCard;
    }

    public BowlingScoreCard getBowlingScoreCard() {
        return bowlingScoreCard;
    }

    public void setBowlingScoreCard(BowlingScoreCard bowlingScoreCard) {
        this.bowlingScoreCard = bowlingScoreCard;
    }
}
