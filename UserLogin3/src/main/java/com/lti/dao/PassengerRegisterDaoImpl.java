package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.User;

@Repository("registerDao")
public class PassengerRegisterDaoImpl implements PassengerRegisterDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public PassengerRegisterDaoImpl() {}
	
	@Override
	@Transactional
	public int passengerRegister(User user) {
		
		String sql1 = "insert into Passenger(PASSENGER_ID,PASSENGER_NAME,PASSENGER_EMAIL,PASSENGER_PHONE,PASSENGER_AGE, PASSENGER_GENDER) values (passenger_id_seq.nextval,:name,:email,:phone,:age,:gender)";
		String sql2 = "insert into Credentials(CREDENTIAL_ID ,USERNAME,PASSWORD,PASSENGER_ID) values(cred_cred_id.nextval,:email,:password,passenger_id_seq.currval)";
		Query query1 = entityManager.createNativeQuery(sql1);
		Query query2 = entityManager.createNativeQuery(sql2);
		
		query1.setParameter("name", user.getPassengerName());
		query1.setParameter("email", user.getPassengerEmail());
		query1.setParameter("phone", user.getPassengerPhoneNumber());
		query1.setParameter("age", user.getPassengerAge());
		query1.setParameter("gender", user.getPassengerGender());
		
		query2.setParameter("email", user.getPassengerEmail());
		query2.setParameter("password", user.getPassword());
		
	
		int passengerResult = query1.executeUpdate();
		int credentialResult = query2.executeUpdate();
		if(passengerResult==1 && credentialResult==1){
			return 1;
		}
		else{
			return 0;
		}
	}

}
