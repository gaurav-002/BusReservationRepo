package com.lti.dao;

import com.lti.model.Credentials;
import com.lti.model.Passenger;

public interface PassengerLoginDao {

	public Passenger readPassenger(String username, String password);
}
