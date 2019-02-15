package com.demoProject.AppManagement.service;

import org.springframework.data.jpa.repository.JpaRepository;


import com.demoProject.AppManagement.model.Application;

public interface AplicationRepository extends JpaRepository<Application,Integer> {
	
}
