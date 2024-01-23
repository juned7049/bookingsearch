package com.searchapi.bookingsearch.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.searchapi.bookingsearch.DTO.SearchResultDTO;
import com.searchapi.bookingsearch.entity.Booking;
import com.searchapi.bookingsearch.entity.CustomerDetails;
import com.searchapi.bookingsearch.repository.BookingRepository;

import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Predicate;

//BookingSearchService.java
@Service
public class BookingSearchService {

	@Autowired
	private BookingRepository bookingRepository;

	public List<SearchResultDTO> searchBookings(String customerName, Date date) {
		Specification<Booking> specification = (root, query, criteriaBuilder) -> {
			List<Predicate> predicates = new ArrayList<>();

			if (customerName != null) {
				Join<Booking, CustomerDetails> customerJoin = root.join("customer");
				predicates.add(criteriaBuilder.like(criteriaBuilder.lower(customerJoin.get("firstName")),
						"%" + customerName.toLowerCase() + "%"));
			}

			if (date != null) {
				predicates.add(criteriaBuilder.equal(root.get("bookingDate"), date));
			}

			return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
		};

		List<Booking> bookings = bookingRepository.findAll(specification);
		return mapToSearchResultDTO(bookings);
	}

	private List<SearchResultDTO> mapToSearchResultDTO(List<Booking> bookings) {
		return bookings.stream()
				.map(booking -> new SearchResultDTO(booking.getCustomer().getFirstName(),
						booking.getCustomer().getEmail(), booking.getCustomer().getMobile(), booking.getBookingDate(),
						booking.getTotalAmount()))
				.collect(Collectors.toList());
	}
}
