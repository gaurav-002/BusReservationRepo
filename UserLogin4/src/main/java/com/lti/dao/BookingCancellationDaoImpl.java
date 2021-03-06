package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.BookingCancellation;
import com.lti.model.BookingDetails;
import com.lti.model.BusDetails;

@Repository("bookingCanellationDao")
public class BookingCancellationDaoImpl implements BookingCancellationDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public int bookingCancellation(BookingCancellation bookingCancellation) {
		
		System.out.println(bookingCancellation);
		
		String delSql = "delete from booking_details where BOOKING_ID = :bookingId";
		String canSql = "insert into booking_cancellation(CANCELLATION_ID,BOOKING_ID,PASSENGER_ID,PASSENGER_EMAIL) values(booking_cancellation_id_seq.nextval,:bookingId,:passengerId,:passengerEmail)";
		
		
		
	//	String updSql = "update table bus_details set SEATS_AVAILABLE = :availableSeats where BUS_ID = :(select BUS_ID from booking_details where BOOKING_ID = :bookID)";
		
		Query delQuery = entityManager.createNativeQuery(delSql, BookingDetails.class);
		Query canQuery = entityManager.createNativeQuery(canSql, BookingCancellation.class);
		
		delQuery.setParameter("bookingId", bookingCancellation.getBookingId());
		
		canQuery.setParameter("bookingId", bookingCancellation.getBookingId());
		canQuery.setParameter("passengerId", bookingCancellation.getPassengerId());
		canQuery.setParameter("passengerEmail", bookingCancellation.getPassengerEmail());
		
		int delResult = delQuery.executeUpdate();
		int canResult = canQuery.executeUpdate();
		
		if(delResult==1 && canResult==1){
			return 1;
		}
		else{
			return 0;
		}
		
	}

}
