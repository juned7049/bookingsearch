package com.searchapi.bookingsearch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class BookingServices {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long bookingservicessid;

	    @ManyToOne
	    @JoinColumn(name = "serviceid")
	    private ServiceProviderService serviceproviderservice ;

	    @ManyToOne
	    @JoinColumn(name = "bookingid")
	    private Booking booking;
	
}
