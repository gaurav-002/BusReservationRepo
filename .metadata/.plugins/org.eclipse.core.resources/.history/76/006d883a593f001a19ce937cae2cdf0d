package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Credentials;

@Repository("dao")
public class CredentialsDaoImpl implements CredentialsDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public CredentialsDaoImpl() {
		
	}



	@Override
	@Transactional
	public Credentials readPassenger(String username, String password) {
		
	 TypedQuery<Credentials> query=entityManager.createQuery("select c From Credentials c where c.username=:username", Credentials.class);
	 query.setParameter("username", username);
	// entityManager.getTransaction().begin();
	 Credentials cred=null;
	 cred = query.getSingleResult();
	// System.out.println(cred);
	// entityManager.getTransaction().commit();
	 String pass=cred.getPassword();
	 String user=cred.getUsername();
	  
	 if(user.equals(username) && pass.equals(password)){
		 return cred;
	 }
	 else{
		 return null;
	}
 }
}
