package com.searchapi.bookingsearch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class BookingPackages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingpackagesid;

    @ManyToOne
    @JoinColumn(name = "packageid")
    private SPServicePackages spServicePackage;

    @ManyToOne
    @JoinColumn(name = "bookingid")
    private Booking booking;

    // Constructors, getters, and setters

    // If needed, you can add additional fields or methods

    public Long getBookingpackagesid() {
        return bookingpackagesid;
    }

    public void setBookingpackagesid(Long bookingpackagesid) {
        this.bookingpackagesid = bookingpackagesid;
    }

    public SPServicePackages getSpServicePackage() {
        return spServicePackage;
    }

    public void setSpServicePackage(SPServicePackages spServicePackage) {
        this.spServicePackage = spServicePackage;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
