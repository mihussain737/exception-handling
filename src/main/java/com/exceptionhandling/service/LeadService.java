package com.exceptionhandling.service;

import com.exceptionhandling.entity.Lead;

public interface LeadService {

	Lead saveLead(Lead lead);

	Lead  getLeadById(Long id);
	
	

}
