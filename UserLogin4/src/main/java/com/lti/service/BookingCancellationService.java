package com.lti.service;

import org.springframework.stereotype.Service;

import com.lti.model.BookingCancellation;


public interface BookingCancellationService {
	public int bookingCancellation(BookingCancellation bookingCancellation);
}
