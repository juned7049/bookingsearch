package com.searchapi.bookingsearch.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.searchapi.bookingsearch.DTO.SearchResultDTO;
import com.searchapi.bookingsearch.service.BookingSearchService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

	@Autowired
	private BookingSearchService bookingSearchService;

	@GetMapping("/search")
	public ResponseEntity<List<SearchResultDTO>> searchBookings(@RequestParam(required = false) String customerName,
			@RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {

		List<SearchResultDTO> searchResults = bookingSearchService.searchBookings(customerName, date);

		return ResponseEntity.ok(searchResults);
	}
}
