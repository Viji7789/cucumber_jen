package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SampleDefinitions {
	 WebDriver driver;

	@Given("User opens the browser and go to google")
	public void user_opens_the_browser_and_go_to_google() {
	 driver=new  ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Google opened");
	}
	
	@When("user enters {string} in the searchbox and hits enter")
	public void user_enters_in_the_searchbox_and_hits_enter(String string) {
		driver.findElement(By.name("q")).sendKeys("automation testing"+ Keys.ENTER);

	}
	/*@When("user enters text in searchbox and click enter")
	public void user_enters_in_search() {
		driver.findElement(By.name("q")).sendKeys("automation testing"+ Keys.ENTER);
		
	}*/



}
