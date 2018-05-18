package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orangeBoy {

	WebDriver driver;
	
	@Given("^I have chrome browser running$")
	public void I_have_chrome_browser_running() {
		System.setProperty("webdriver.chrome.driver", "/Users/waqemhaq/Desktop/Selinum/Drivers/chromedriver");
		driver=new ChromeDriver();
	}
	
	@When("^I go to the website$")
	public void I_go_to_the_website() {
		driver.get("http://opensource.demo.orangehrmlive.com/");
	
	}
	
	@When("^i enter valid username$")
	public void i_enter_valid_username () {
		driver.findElement(By.xpath("//*[@id=\'txtUsername\']")).sendKeys("Admin");
		
	}
	
	@When("^I enter valid password$")
	public void I_enter_valid_password() {
		driver.findElement(By.xpath("//*[@id=\'txtPassword\']")).sendKeys("admin");
	}
	
	@When("^I wait before i login in$")
	public void I_wait_before_i_login_in() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\'btnLogin\\']")));
	}
	
	@Then("^I click on the login button$")
	public void I_click_on_the_login_button() {
		driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();
	}
}
