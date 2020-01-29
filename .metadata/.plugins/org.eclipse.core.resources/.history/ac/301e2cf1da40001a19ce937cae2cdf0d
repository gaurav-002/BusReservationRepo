package com.lti.model;

import javax.persistence.ManyToOne;

public class BusDetails {

	private int busId;
	private String busName;
	private String busDepartureTime;
	private String busArrivalTime;
	private int busFare;
	private int seatsAvailable;
	
	@ManyToOne
	private Route route;
	
	
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public BusDetails(int busId, String busName, String busDepartureTime, String busArrivalTime, int busFare,
			int seatsAvailable) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.busDepartureTime = busDepartureTime;
		this.busArrivalTime = busArrivalTime;
		this.busFare = busFare;
		this.seatsAvailable = seatsAvailable;
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
	
	

	
	
	
	
}
//create table bus_details
//(bus_id number(5) primary key,
// bus_name varchar(15),
// bus_departure_time varchar(8) not null,
// bus_arrival_time varchar(8) not null,
// bus_fare varchar(4) not null,
// route_id number(4),
// seats_available number(3),
// constraint bus_details_route_id_fk foreign key(route_id) references route_details(route_id));