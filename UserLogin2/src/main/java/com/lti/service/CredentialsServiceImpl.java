package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.PassengerLoginDao;
import com.lti.dao.PassengerLoginDaoImpl;
import com.lti.model.Credentials;

@Service
public class CredentialsServiceImpl implements CredentialsService {
	
	@Autowired
	private PassengerLoginDao dao;

	public CredentialsServiceImpl() {
		super();
		dao=new PassengerLoginDaoImpl();
	}

	@Override
	public Credentials readPassenger(String username, String password) {
		Credentials cred=dao.readPassenger(username, password);
		return cred;
		
		

	}

}
