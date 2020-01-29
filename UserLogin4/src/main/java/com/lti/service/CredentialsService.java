package com.lti.service;

import com.lti.model.Credentials;
import com.lti.model.Passenger;

public interface CredentialsService {
	public Passenger readPassenger(String username, String password);
}
