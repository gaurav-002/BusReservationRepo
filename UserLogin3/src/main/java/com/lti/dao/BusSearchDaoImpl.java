package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.BusDetails;
import com.lti.model.BusSearch;

@Repository("busSearchDao")
public class BusSearchDaoImpl implements BusSearchDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public List<BusDetails> busSearch(BusSearch busSearch) {
		TypedQuery<BusDetails> query=entityManager.createQuery("select b From BusDetails b where b.busSource=:source and b.busDestination=:destination and b.busDate=:date and b.seatsAvailable > :travellers", BusDetails.class);
		 
		 query.setParameter("source", busSearch.getSource());
		 query.setParameter("destination", busSearch.getDestination());
		 query.setParameter("date", busSearch.getDate());
		 query.setParameter("travellers", busSearch.getNoOfPassengers());
		 
		 List<BusDetails> bs = query.getResultList();
		 System.out.println(bs);
		 return bs;
	}

}
