package com.lti.dao;

import com.lti.model.Credentials;

public interface PassengerLoginDao {

	public Credentials readPassenger(String username, String password);
}
