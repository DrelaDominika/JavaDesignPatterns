package com.java.designpatterns.mediator;

public class Parking implements Command {
    private IParkingController parkingControllerMediator;

    Parking(IParkingController parkingControllerMediator) {
        this.parkingControllerMediator = parkingControllerMediator;
    }

    @Override
    public void parkHere() {
        if (parkingControllerMediator.isAvailable()) {
            System.out.println("Car parked successfully");
            parkingControllerMediator.setAvailabilityStatus(false); //parking spot unavailable
        } else {
            System.out.println("Waiting for a parking spot");
        }
    }

    public void readyToPark() {
        System.out.println("Parking initiated");
    }

    public void parked() {
        System.out.println("Car is parked");
        parkingControllerMediator.setAvailabilityStatus(true); //parking spot available
    }
}
