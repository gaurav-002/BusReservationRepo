package com.lti.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookingCancellation {
	
	@Id
	@Column(name="cancellation_id")
	private int cancellationId;
	@Column(name="booking_id")
	private int bookingId;
	@Column(name="passenger_id")
	private int passengerId;
	@Column(name="passenger_email")
	private String passengerEmail;
	
	public BookingCancellation(){
		super();
	}
	
	public BookingCancellation(int cancellationId, int bookingId, int passengerId, String passengerEmail) {
		super();
		this.cancellationId = cancellationId;
		this.bookingId = bookingId;
		this.passengerId = passengerId;
		this.passengerEmail = passengerEmail;
	}

	public int getCancellationId() {
		return cancellationId;
	}

	public void setCancellationId(int cancellationId) {
		this.cancellationId = cancellationId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerEmail() {
		return passengerEmail;
	}

	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

	@Override
	public String toString() {
		return "BookingCancellation [cancellationId=" + cancellationId + ", bookingId=" + bookingId + ", passengerId="
				+ passengerId + ", passengerEmail=" + passengerEmail + "]";
	}
	
	
	
	
}

/*create table booking_cancellation
(cancellation_id number(5) primary key,
 booking_id number(5) ,
 passenger_id number(5),
 passenger_email varchar(20) not null unique 
 );*/