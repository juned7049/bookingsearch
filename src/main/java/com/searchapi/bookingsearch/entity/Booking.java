package com.searchapi.bookingsearch.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;

	@ManyToOne
	@JoinColumn(name = "customerid")
	private CustomerDetails customer;

	@Column(name = "bookingdate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date bookingDate;

	@Column(name = "totalamount")
	private BigDecimal totalAmount;

	@Column(name = "contactphone")
	private String contactPhone;

	@Column(name = "contactemail")
	private String contactEmail;

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(Long bookingId, CustomerDetails customer, Date bookingDate, BigDecimal totalAmount,
			String contactPhone, String contactEmail) {
		super();
		this.bookingId = bookingId;
		this.customer = customer;
		this.bookingDate = bookingDate;
		this.totalAmount = totalAmount;
		this.contactPhone = contactPhone;
		this.contactEmail = contactEmail;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public CustomerDetails getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDetails customer) {
		this.customer = customer;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", customer=" + customer + ", bookingDate=" + bookingDate
				+ ", totalAmount=" + totalAmount + ", contactPhone=" + contactPhone + ", contactEmail=" + contactEmail
				+ "]";
	}

}
