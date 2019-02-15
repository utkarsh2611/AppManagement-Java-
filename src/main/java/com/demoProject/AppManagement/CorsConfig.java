package com.demoProject.AppManagement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class CorsConfig {
	
	@Bean
	  public WebMvcConfigurer corsConfigurer() {
	    return new WebMvcConfigurerAdapter() {
	      @Override
	      public void addCorsMappings(final CorsRegistry registry) {
	        registry.addMapping("/**").allowedMethods("*");
	      }
	    };
	  }

} 
