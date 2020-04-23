package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.BookingCancellationDao;
import com.lti.dao.BookingCancellationDaoImpl;
import com.lti.model.BookingCancellation;

@Service("bookingCancellation")
public class BookingCancellationServiceImpl implements BookingCancellationService {

	@Autowired
	private BookingCancellationDao dao;
	
	public BookingCancellationServiceImpl() {
		dao = new BookingCancellationDaoImpl(); 
	}
	
	@Override
	public int bookingCancellation(BookingCancellation bookingCancellation) {
		int candetails=dao.bookingCancellation(bookingCancellation);
		if(candetails==1){
			return 1;
		}
		else{
			return 0;
		}
		
	}

}