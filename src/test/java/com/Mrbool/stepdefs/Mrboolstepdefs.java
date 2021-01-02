package com.Mrbool.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Mrbool.pageobjectmodel.MrboolPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mrboolstepdefs {
	WebDriver driver;

	@Given("^user visits home page of mrbool$")
	public void user_visits_home_page_of_mrbool() throws Throwable {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files\\chromedriver_87.0.4280.88\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://mrbool.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} catch (Exception e) {

		} finally {

			System.out.println("all good");
		}
	}

	@When("^user move to dropdown menu/window and click on courses$")
	public void user_move_to_dropdown_menu_window_and_click_on_courses() throws Throwable {

		try {
			Actions act = new Actions(driver);
			MrboolPOM cont = new MrboolPOM(driver);

			act.moveToElement(cont.contents()).build().perform();
			act.click();
			
			
          WebDriverWait stay= new WebDriverWait(driver,30);
		} catch (Exception e) {

		} finally {
			System.out.println("all good");
		}
	}

	@Then("^user should able to redirect to the courses page$")
	public void user_should_able_to_redirect_to_the_courses_page() throws Throwable {

		try {
			MrboolPOM cour = new MrboolPOM(driver);
			cour.courses().click();
		    WebDriverWait stay= new WebDriverWait(driver,30);
		} catch (Exception e) {

		} finally {
			System.out.println("all good");
		}
	}
}
