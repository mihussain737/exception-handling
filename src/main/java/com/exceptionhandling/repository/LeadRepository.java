package com.exceptionhandling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exceptionhandling.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long>{

}
