package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.BookingDetails;
import com.lti.model.BusDetails;

@Repository("bookingDao")
public class BookingDetailsDaoImpl implements BookingDetailsDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public int bookBus(BookingDetails bookBus) {
		entityManager.persist(bookBus);
		return bookBus.getBookingId();
	}
	

}
//booking_id number(5) primary key,
//passenger_id number(5),	 
//passenger_age number(3),
//passenger_name varchar(20),
//passenger_gender varchar(10),
//bus_id number(5),	 
//bus_fare number(5),	 
//bus_name varchar(15),
//bus_source varchar(15),
//bus_destination varchar(15),
//bus_departure_time varchar(8) not null,
//bus_departure_date varchar(15),
//booking_date varchar(20)




//insert into Booking_details(BOOKING_ID,PASSENGER_ID,PASSENGER_AGE,PASSENGER_NAME,PASSENGER_GENDER,BUS_ID,BUS_FARE,BUS_NAME,BUS_SOURCE,BUS_DESTINATION,BUS_DEPARTURE_TIME,BUS_DEPARTURE_DATE,BOOKING_DATE)values(booking_detail_booking_id.nextval,124,25,'Akshay',:pGender,:bId,:bFare,:bName,:bSource,:bDestination,:bTime,:bDate,:bookDAte)

