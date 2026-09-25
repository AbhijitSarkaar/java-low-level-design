package CaseStudies.OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class WarehouseController {
    List<Warehouse> warehouses;
    WarehouseSelectionStrategy warehouseSelectionStrategy;

    public WarehouseController(WarehouseSelectionStrategy warehouseSelectionStrategy) {
        this.warehouses = new ArrayList<>();
        this.warehouseSelectionStrategy = warehouseSelectionStrategy;
    }

    public void addWarehouse(Warehouse warehouse) {
        warehouses.add(warehouse);
    }

    public Warehouse getWarehouse() {
        return warehouseSelectionStrategy.select(warehouses);
    }
}
