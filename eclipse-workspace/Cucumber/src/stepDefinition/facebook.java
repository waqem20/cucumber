package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebook {
	WebDriver driver;
	@Given("^I have opera browser running$")
	public void I_have_opera_browser_running() {
		System.setProperty("webdriver.opera.driver", "/Users/waqemhaq/Desktop/Selinum/Drivers/operadriver");
		driver= new OperaDriver();
	}
	
	@When("^I go to the website facebook$")
	public void I_go_to_the_website() {
		driver.get("https://www.facebook.com/");
	}
	
	@When("^i enter valid username facebook$")
	public void i_enter_valid_username() {
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("waqem20@yahoo.com");
	}
	
	@When("^I enter valid password facebook$")
	public void I_enter_valid_password() {
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Shaq5035");
	}
	
	@When("^I click on the login button facebook$")
	public void I_click_on_the_login_button() {
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
	}
	
	@Then("^I should see a logout link facebook$")
	public void I_should_see_a_logout_link() {
		//write sumthing
	}
	
}
