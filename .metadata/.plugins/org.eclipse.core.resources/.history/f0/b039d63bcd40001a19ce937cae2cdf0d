package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.CredentialsDao;
import com.lti.dao.CredentialsDaoImpl;
import com.lti.model.Credentials;

@Service
public class CredentialsServiceImpl implements CredentialsService {
	
	@Autowired
	private CredentialsDao dao;

	public CredentialsServiceImpl() {
		super();
		dao=new CredentialsDaoImpl();
	}

	@Override
	public Credentials readPassenger(String username, String password) {
		Credentials cred=dao.readPassenger(username, password);
		return cred;
		
		

	}

}
