package SolidPrinciples.InterfaceSeggregation;

public class RestaurantEmployee implements MaintenanceTasks {
    @Override
    public void cleanKitchen() {
        System.out.println("RestaurantEmployee.cleanKitchen()");
    }

    @Override
    public void reStockGroceries() {
        System.out.println("RestaurantEmployee.reStockGroceries()");
    }
}
