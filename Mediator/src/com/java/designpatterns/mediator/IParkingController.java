package com.java.designpatterns.mediator;

public interface IParkingController {
    public void registerParking(Parking parking);

    public void registerParkingSpot(ParkingSpot parkingSpot);

    public void setAvailabilityStatus(Boolean status);

    public Boolean isAvailable();
}
