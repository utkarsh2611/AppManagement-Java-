package com.demoProject.AppManagement.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demoProject.AppManagement.model.Application;
import com.demoProject.AppManagement.service.ApplicationService;

@RestController
public class AppController {
	
	@Autowired
	private ApplicationService applicationService;
	
	@GetMapping("/appName")
	public List<Application> getAllApp(){
		return applicationService.getAllApp(); 
		
	}
	
	@RequestMapping("/appName/{id}")
	public Optional<Application> getApp(@PathVariable int id) {
	 return applicationService.getApp(id);
	}	
	
	@PostMapping("/appName")
	public void addApp(@RequestBody Application application) {
		
		applicationService.addApp(application);
			
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/appName/{id}")
	public void updateApp(@RequestBody Application application,  @PathVariable int id) {
		
		applicationService.updateApp(id, application);
			
	}

	@DeleteMapping( "/appName/{id}")
	public void deleteApp(@PathVariable int id) {
		
		applicationService.deleteApp(id);
			
	}





















}
