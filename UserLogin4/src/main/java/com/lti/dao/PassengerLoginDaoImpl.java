package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Credentials;
import com.lti.model.Passenger;

@Repository("credentialsDao")
public class PassengerLoginDaoImpl implements PassengerLoginDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public PassengerLoginDaoImpl() {
		
	}

	@Override
	@Transactional
	public Passenger readPassenger(String username, String password) {
		
	 TypedQuery<Credentials> query=entityManager.createQuery("select c From Credentials c where c.username=:username", Credentials.class);
	 query.setParameter("username", username);
	// entityManager.getTransaction().begin();
	 Credentials cred=null;
	 cred = query.getSingleResult();
	 
	 String jpql = "FROM Passenger WHERE passengerId = :pId";
	 TypedQuery<Passenger> query2 = entityManager.createQuery(jpql, Passenger.class);
	 query2.setParameter("pId", cred.getPassengerId());
	// System.out.println(cred);
	// entityManager.getTransaction().commit();
	 String pass=cred.getPassword();
	 String user=cred.getUsername();
	  
	 if(user.equals(username) && pass.equals(password)){
		 return query2.getSingleResult();
	 }
	 else{
		 return null;
	}
 }
}
