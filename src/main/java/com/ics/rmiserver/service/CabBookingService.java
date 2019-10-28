package com.ics.rmiserver.service;

import com.ics.rmiserver.model.Booking;

import java.time.LocalTime;

public interface CabBookingService {
    public Booking bookRide(String pickupLocation, LocalTime orderTime);
}
