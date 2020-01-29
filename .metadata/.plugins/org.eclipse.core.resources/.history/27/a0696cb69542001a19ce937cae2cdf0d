package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.BookingDetailsDao;
import com.lti.dao.BookingDetailsDaoImpl;
import com.lti.model.BookingDetails;
@Service("bookingService")
public class BookingDetailsServiceImpl implements BookingDetailsService {
	
	@Autowired
	private BookingDetailsDao dao;
	
	public BookingDetailsServiceImpl() {
		dao = new BookingDetailsDaoImpl();
	}

	@Override
	public boolean bookBus(BookingDetails bookBus) {
		int details = dao.bookBus(bookBus);
		if(details==1){
		return true;
		}
		else{
			return false;
		}
	}

}