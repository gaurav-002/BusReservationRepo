package com.lti.dao;

import java.util.List;

import com.lti.model.BusDetails;
import com.lti.model.BusSearch;

public interface BusSearchDao {
	public List<BusDetails> busSearch(BusSearch busSearch);
} 
