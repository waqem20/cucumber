package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orangeWeb2 {
	WebDriver driver;
	
//	@Given("^I want to get chromebrowser$")
//	public void I_want_to_get_chromebrowser() {
//		System.setProperty("webdriver.chrome.driver", "/Users/waqemhaq/Desktop/Selinum/Drivers/chromedriver");
//		driver= new ChromeDriver();
//		
//	}
	@When("^I will get the orange website$")
	public void I_will_get_the_orange_website() {
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
	
	}
	
//	@When("^I put valid inputs in the username box$")
//	public void I_put_valid_inputs_in_the_username_box(){
//		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//	}
//	
//	@When("^I put valid inputs in the password box$")
//	public void I_put_valid_inputs_in_the_password_box() {
//		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
//	}
	
	@When("^I put valid inputs in the username box and password box$")
	public void i_put_valid_inputs_in_the_username_box_and_password_box(DataTable data) throws Throwable {
		List<List<String>>dataT=data.raw();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(dataT.get(0).get(0));
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(dataT.get(0).get(1));
}

	
	@When("^I will click the sumbit button$")
	public void I_will_click_the_sumbit_button() {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

	}
	
	@When ("^I will click the PIM button and add an employee$")
	public void I_will_click_the_PIM_button_and_add_an_employee() {
		driver.findElement(By.xpath("//*[@id=\'menu_pim_viewPimModule\']/b")).click();
		driver.findElement(By.cssSelector("input[name='btnAdd']")).click();
		
	}@Then("^I will add first name and last name$")
	public void i_will_add_first_name_and_last_name(DataTable date) throws Throwable {
		List<List<String>>dataA=date.raw();
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(dataA.get(0).get(0));
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(dataA.get(0).get(1));

	}



	
	
	//Hook
	@Before
	public void runBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/waqemhaq/Desktop/Selinum/Drivers/chromedriver");
		driver= new ChromeDriver();
		
	}//after hook
	@After
	public void after() {
		driver.quit();
	}

}
