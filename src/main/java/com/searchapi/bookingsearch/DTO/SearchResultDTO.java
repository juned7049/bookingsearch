package com.searchapi.bookingsearch.DTO;

import java.math.BigDecimal;
import java.util.Date;

public class SearchResultDTO {
	private String customerName;
	private String email;
	private String mobile;
	private Date bookingDate;
	private BigDecimal totalAmount;

	public SearchResultDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SearchResultDTO(String customerName, String email, String mobile, Date bookingDate, BigDecimal totalAmount) {
		super();
		this.customerName = customerName;
		this.email = email;
		this.mobile = mobile;
		this.bookingDate = bookingDate;
		this.totalAmount = totalAmount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	@Override
	public String toString() {
		return "SearchResultDTO [customerName=" + customerName + ", email=" + email + ", mobile=" + mobile
				+ ", bookingDate=" + bookingDate + ", totalAmount=" + totalAmount + "]";
	}

}
