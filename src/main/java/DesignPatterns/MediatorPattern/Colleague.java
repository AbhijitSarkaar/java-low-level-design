package DesignPatterns.MediatorPattern;

public interface Colleague {
    void placeBid(int amount);

    void receiveNotification(Colleague colleague, int amount);

    String getName();
}
