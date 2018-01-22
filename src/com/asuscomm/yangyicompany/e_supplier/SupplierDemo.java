package com.asuscomm.yangyicompany.e_supplier;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void driveVehicle(Supplier<? extends Vehicle> supplier) {
        supplier.get().drive();
    }
}
