package CaseStudies.CricBuzz;

import java.util.ArrayList;
import java.util.List;

public class Match {
    Team teamOne;
    Team teamTwo;
    MatchType matchType;
    List<Innings> inningsList;

    public Match(Team teamOne, Team teamTwo, MatchType matchType) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.matchType = matchType;
        this.inningsList = new ArrayList<>();

        setup();
    }

    void setup() {

        Observable ballDeliveryObservable = new BallDeliveryObservable();
        Observer battingObserver = new BattingObserver();
        Observer ballingObserver = new BallingObserver();
        ballDeliveryObservable.addObserver(battingObserver);
        ballDeliveryObservable.addObserver(ballingObserver);

        Innings innings1 = new Innings(teamOne, teamTwo, matchType.getNoOfOvers(), ballDeliveryObservable);
        Innings innings2 = new Innings(teamTwo, teamOne, matchType.getNoOfOvers(), ballDeliveryObservable);
        inningsList.add(innings1);
        inningsList.add(innings2);

    }

    public Innings getFirstInnings() {
        return inningsList.get(0);
    }

    public Innings getSecondInnings() {
        return inningsList.get(1);
    }
}
