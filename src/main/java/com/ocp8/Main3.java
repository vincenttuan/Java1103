package com.ocp8;

public class Main3 {
    public static void main(String[] args) {
        RentalCompany rc = new RentalCompany();
        rc.rentTransportation(Airplane.class, 2);
        rc.print();
    }
}
