package com.java.designpatterns.mediator;

public class ParkingController implements IParkingController {

    private Parking parking;
    private ParkingSpot parkingSpot;
    public Boolean available;

    @Override
    public void registerParking(Parking parking) {
        this.parking = parking;
    }

    @Override
    public void registerParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    @Override
    public void setAvailabilityStatus(Boolean status) {
        this.available = status;
    }

    @Override
    public Boolean isAvailable() {
        return available;
    }
}
