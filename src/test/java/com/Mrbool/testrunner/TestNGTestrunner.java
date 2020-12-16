package com.Mrbool.testrunner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGTestrunner {

	
	
	   @Test
	  @CucumberOptions(
			  
			  
			  features = {"Features"},
			  glue = {"com.Mrbool.stepdefs"},
			  tags = {"@MrboolFeature"}
			  
			    )
	  
	  
	         public class Testrunner extends AbstractTestNGCucumberTests{
		  
		  
		  
		  
		  
	  }
	
	
}
