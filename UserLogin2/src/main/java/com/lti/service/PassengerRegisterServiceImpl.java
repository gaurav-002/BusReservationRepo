package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lti.dao.PassengerRegisterDao;
import com.lti.model.User;

@Service("service")
@Scope(scopeName="singleton")
public class PassengerRegisterServiceImpl implements PassengerRegisterService {
	
	@Autowired
	private PassengerRegisterDao dao;
	
	@Override
	public boolean passengerRegister(User user) {	
		if(dao.passengerRegister(user)==1)
			return true;
		else 
			return false;
	}
	
	public PassengerRegisterDao getDao() {
		return dao;
	}
	
	public void setDao(PassengerRegisterDao dao) {
		this.dao = dao;
	}

	
	
	

}
