package com.Mrbool.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MrboolPOM {
	
	
	    WebDriver driver;
	    
	    public MrboolPOM(WebDriver driver) {
	    	
	    	this.driver=driver;
	    	 PageFactory.initElements(driver, this);
	    	
	    }
	    	
	    	
	    @FindBy(xpath= "//span[@id=\"headermenudesktop\"]/ul/li/a")
	    
	    WebElement click_contents;
	    
	    public WebElement contents() {
	    	
	    	return click_contents;
	    	
	    	
	    }
	    
	  	
	    @FindBy(xpath= "//ul[@class =\"submenu\"]/li[2]/a")
	    
	    WebElement click_courses;
	    
	    public WebElement courses() {
	    	
	    	return click_courses;
	    
	    
	    
	    }
	    
	    
}
	


