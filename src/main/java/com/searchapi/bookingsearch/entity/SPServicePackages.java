package com.searchapi.bookingsearch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SPServicePackages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packageid;

    @Column(name = "packagename")
    private String packagename;

    @Column(name = "description")
    private String description;

	public SPServicePackages() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SPServicePackages(Long packageid, String packagename, String description) {
		super();
		this.packageid = packageid;
		this.packagename = packagename;
		this.description = description;
	}

	public Long getPackageid() {
		return packageid;
	}

	public void setPackageid(Long packageid) {
		this.packageid = packageid;
	}

	public String getPackagename() {
		return packagename;
	}

	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


    
}
