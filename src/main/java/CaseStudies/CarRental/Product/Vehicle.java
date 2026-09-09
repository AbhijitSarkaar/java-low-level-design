package CaseStudies.CarRental.Product;

import CaseStudies.CarRental.Enum.VehicleStatus;
import CaseStudies.ParkingLot.Enums.VehicleType;

import java.util.UUID;

public class Vehicle {
    public UUID vehicleId;
    public VehicleType vehicleType;
    public VehicleStatus vehicleStatus;
    String vehicleNumber;
    double dailyRentCost;

    public Vehicle(VehicleType vehicleType, String vehicleNumber) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.vehicleId = UUID.randomUUID();
        this.vehicleStatus = VehicleStatus.AVAILABLE;
    }

    public UUID getVehicleId() {
        return vehicleId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public double getDailyRentCost() {
        return dailyRentCost;
    }

    public void setDailyRentCost(double dailyRentCost) {
        this.dailyRentCost = dailyRentCost;
    }
}
