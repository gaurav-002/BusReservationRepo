package com.lti.dao;

import com.lti.model.Credentials;

public interface CredentialsDao {

	public Credentials readPassenger(String username, String password);
}
