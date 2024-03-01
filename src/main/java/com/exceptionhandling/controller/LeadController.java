package com.exceptionhandling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exceptionhandling.entity.Lead;
import com.exceptionhandling.service.LeadService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/leads")
@AllArgsConstructor
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@PostMapping
	public ResponseEntity<Lead> saveLead(@RequestBody Lead lead){
		Lead savedLead=leadService.saveLead(lead);
		return new ResponseEntity<Lead>(savedLead,HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Lead> getLeadById(@PathVariable Long id){
		Lead leadById = leadService.getLeadById(id);
		return new ResponseEntity<Lead>(leadById,HttpStatus.OK);
	}

}
