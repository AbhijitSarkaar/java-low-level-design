package SolidPrinciples.InterfaceSeggregation;

public class Chef implements ChefTasks {
    @Override
    public void cook() {
        System.out.println("Chef.cook()");
    }

    @Override
    public void prepareMenu() {
        System.out.println("Chef.prepareMenu()");
    }
}
