package com.ics.rmiserver.service;

import com.ics.rmiserver.model.Booking;

import java.time.LocalTime;

public class CabBookingServiceImpl implements CabBookingService {

    @Override
    public Booking bookRide(String pickupLocation, LocalTime orderTime) {
        System.out.println("================Server Side ========================");
        System.out.println("The Pickup Location is at " + pickupLocation + ", for the order made at " + orderTime);
        Booking newBooking = new Booking(pickupLocation, orderTime);
        newBooking.updatePickupTime();
        System.out.println("The Cab will arrive at the following time: " + newBooking.getPickupTime());
        System.out.println("The Booking Order: " + newBooking.toString());
        return newBooking;
    }
}
