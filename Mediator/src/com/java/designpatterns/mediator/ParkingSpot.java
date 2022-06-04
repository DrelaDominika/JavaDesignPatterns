package com.java.designpatterns.mediator;

public class ParkingSpot implements Command {
    private IParkingController parkingControllerMediator;

    ParkingSpot(IParkingController parkingControllerMediator) {
        this.parkingControllerMediator = parkingControllerMediator;
    }

    @Override
    public void parkHere() {
        System.out.println("Parking spot is available");
        parkingControllerMediator.setAvailabilityStatus(true);
    }
}
