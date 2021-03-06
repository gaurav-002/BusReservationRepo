package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bus_details")
public class BusDetails {
	@Id
	@Column(name="bus_id")
	private int busId;
	@Column(name="bus_name")
	private String busName;
	@Column(name="bus_source")
	private String busSource;
	@Column(name="bus_destination")
	private String busDestination;
	@Column(name="bus_departure_time")
	private String busDepartureTime;
	@Column(name="bus_arrival_time")
	private String busArrivalTime;
	@Column(name="bus_fare")
	private int busFare;
	@Column(name="seats_available")
	private int seatsAvailable;
	@Column(name="bus_date")
	private String busDate;
	public BusDetails(int busId, String busName, String busSource, String busDestination, String busDepartureTime,
			String busArrivalTime, int busFare, int seatsAvailable, String busDate) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.busSource = busSource;
		this.busDestination = busDestination;
		this.busDepartureTime = busDepartureTime;
		this.busArrivalTime = busArrivalTime;
		this.busFare = busFare;
		this.seatsAvailable = seatsAvailable;
		this.busDate = busDate;
	}
	public BusDetails() {
		super();
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getBusSource() {
		return busSource;
	}
	public void setBusSource(String busSource) {
		this.busSource = busSource;
	}
	public String getBusDestination() {
		return busDestination;
	}
	public void setBusDestination(String busDestination) {
		this.busDestination = busDestination;
	}
	public String getBusDepartureTime() {
		return busDepartureTime;
	}
	public void setBusDepartureTime(String busDepartureTime) {
		this.busDepartureTime = busDepartureTime;
	}
	public String getBusArrivalTime() {
		return busArrivalTime;
	}
	public void setBusArrivalTime(String busArrivalTime) {
		this.busArrivalTime = busArrivalTime;
	}
	public int getBusFare() {
		return busFare;
	}
	public void setBusFare(int busFare) {
		this.busFare = busFare;
	}
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	public String getBusDate() {
		return busDate;
	}
	public void setBusDate(String busDate) {
		this.busDate = busDate;
	}
	@Override
	public String toString() {
		return "BusDetails [busId=" + busId + ", busName=" + busName + ", busSource=" + busSource + ", busDestination="
				+ busDestination + ", busDepartureTime=" + busDepartureTime + ", busArrivalTime=" + busArrivalTime
				+ ", busFare=" + busFare + ", seatsAvailable=" + seatsAvailable + ", busDate=" + busDate + "]";
	}
	
	

}
//create table bus_details
//(bus_id number(5) primary key,
// bus_name varchar(15),
// bus_source varchar(15),
// bus_destination varchar(15),
// bus_departure_time varchar(8) not null,
// bus_arrival_time varchar(8) not null,
// bus_fare varchar(4) not null,
//	 seats_available number(3),
// bus_date varchar(15));