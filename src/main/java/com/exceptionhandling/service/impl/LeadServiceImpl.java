package com.exceptionhandling.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exceptionhandling.entity.Lead;
import com.exceptionhandling.exception.ResourceNotFoundException;
import com.exceptionhandling.repository.LeadRepository;
import com.exceptionhandling.service.LeadService;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public Lead saveLead(Lead lead) {
		Lead save = leadRepo.save(lead);
		return save;
	}

	@Override
	public Lead getLeadById(Long id) {
		Lead byId = leadRepo.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Lead not found with id:- "+id)
				);
		return byId;
	}

}
