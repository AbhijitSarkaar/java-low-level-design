package CaseStudies.CricBuzz;

import java.util.ArrayList;
import java.util.List;

public class BallDeliveryObservable implements Observable {

    Ball currentBallInfo;
    List<Observer> observers;

    public BallDeliveryObservable() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void setCurrentBallInfo(Ball currentBallInfo) {
        this.currentBallInfo = currentBallInfo;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(currentBallInfo);
        }
    }
}
