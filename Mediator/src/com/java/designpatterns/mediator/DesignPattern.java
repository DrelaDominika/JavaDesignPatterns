package com.java.designpatterns.mediator;

public class DesignPattern {
    public static void main(String[] args) {
        IParkingController parkingControllerMediator = new ParkingController();
        ParkingSpot parkingSpot = new ParkingSpot(parkingControllerMediator);

        Parking parking1 = new Parking(parkingControllerMediator);

        Parking parking2 = new Parking(parkingControllerMediator);

        parkingControllerMediator.registerParking(parking1);
        parkingControllerMediator.registerParkingSpot(parkingSpot);

        parking1.readyToPark();
        parkingSpot.parkHere();
        parking1.parkHere();
        parking2.parkHere();
        parking1.parked();
        parking2.parkHere();
    }
}
