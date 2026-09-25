package CaseStudies.OrderManagementSystem;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class NearestWarehouseStrategy implements WarehouseSelectionStrategy {
    @Override
    public Warehouse select(List<Warehouse> warehouses) {
        return warehouses.get(ThreadLocalRandom.current().nextInt(0, warehouses.size()));
    }
}
