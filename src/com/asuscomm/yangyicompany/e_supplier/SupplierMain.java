package com.asuscomm.yangyicompany.e_supplier;

public class SupplierMain {

    public static void main(String[] args) {
        SupplierDemo.driveVehicle(Vehicle::new);
        SupplierDemo.driveVehicle(Car::new);
        SupplierDemo.driveVehicle(Motorcycle::new);
    }
}
