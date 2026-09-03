package SolidPrinciples.InterfaceSeggregation;

public class Main {
    public static void main(String[] args) {

        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        RestaurantEmployee restaurantEmployee = new RestaurantEmployee();

        chef.cook();
        chef.prepareMenu();

        waiter.takeOrder();
        waiter.serveFood();

        restaurantEmployee.cleanKitchen();
        restaurantEmployee.reStockGroceries();

    }
}
