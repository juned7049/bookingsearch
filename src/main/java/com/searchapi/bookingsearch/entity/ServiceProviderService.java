package com.searchapi.bookingsearch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ServiceProviderService {

	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long serviceid;

	    @Column(name = "servicename")
	    private String servicename;

	    @Column(name = "description")
	    private String description;

	
}
