package com.demoProject.AppManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoProject.AppManagement.model.Application;

@Service
public class ApplicationService {
	@Autowired
	private AplicationRepository applicationRepository;
	
	
	  
	  public List<Application> getAllApp(){
		  List<Application> applications = (List<Application>) applicationRepository.findAll();
          return applications;
	  }                                                                                                                                                                                                                                                                                      
			                                                   
		public Optional<Application> getApp(int id) {
			
			return applicationRepository.findById(id);
		}	  
		
		public void addApp(Application application) {
			
			applicationRepository.save(application);
			
		}
		public void updateApp(int Id,Application application) {
			
			applicationRepository.save(application);
		}
		
		public void deleteApp(int Id) {
		applicationRepository.deleteById(Id);                                                
		}
}
