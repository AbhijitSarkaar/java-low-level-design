package SolidPrinciples.InterfaceSeggregation;

public class Waiter implements WaiterTasks {
    @Override
    public void takeOrder() {
        System.out.println("Waiter.takeOrder()");
    }

    @Override
    public void serveFood() {
        System.out.println("Waiter.serveFood()");
    }
}
