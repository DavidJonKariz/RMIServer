package com.ics.rmiserver.model;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Booking {
    public String pickupLocation;
    public LocalTime orderTime;
    public LocalTime pickupTime;

    public Booking(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public Booking(String pickupLocation, LocalTime orderTime) {
        this.pickupLocation = pickupLocation;
        this.orderTime = orderTime;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalTime orderTime) {
        this.orderTime = orderTime;
    }

    public LocalTime getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(LocalTime pickupTime) {
        this.pickupTime = pickupTime;
    }

    public void updatePickupTime() {
        this.pickupTime = this.orderTime.plus(15, ChronoUnit.MINUTES);
    }

    @Override
    public String toString() {
        return "Booking { " +
                "pickupLocation = '" + pickupLocation + '\'' +
                ", orderTime = " + orderTime +
                ", pickupTime = " + pickupTime +
                '}';
    }
}
