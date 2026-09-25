package CaseStudies.OrderManagementSystem;

import java.util.List;

public interface WarehouseSelectionStrategy {
    Warehouse select(List<Warehouse> warehouses);
}
