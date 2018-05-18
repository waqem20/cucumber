package stepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.bcel.classfile.Utility;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class website {
	WebDriver driver;
	TakesScreenshot myScreen;
	@Given("^find the path$")
	public void find_the_path() {
		System.setProperty("webdriver.opera.driver", "/Users/waqemhaq/Desktop/Selinum/Drivers/operadriver");
		driver= new OperaDriver();
		
	}
	
	@When("^I go onto orange website$")
	public void I_go_onto_orange_website() {
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
	}
	
	@When("^I will then add username and password inputs$")
	public void i_will_then_add_username_and_password_inputs(DataTable data) throws Throwable {
	    List<List<String>> dataT=data.raw();
	    driver.findElement(By.name("txtUsername")).sendKeys(dataT.get(0).get(0));
	    driver.findElement(By.name("txtPassword")).sendKeys(dataT.get(0).get(1));
	    
	}
	
	@When("^I will then click the sign in button$")
	public void I_will_then_click_the_sign_in_button() {
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	}
	
	@Then("^I will click the pim button to add employees$")
	public void I_will_click_the_pim_button_to_add_employees() {
		
		driver.findElement(By.xpath("//*[@id=\'menu_pim_viewPimModule\']/b")).click();
		driver.findElement(By.cssSelector("input[name='btnAdd']")).click();
	}
	
	@When("^I will add firstname and last name$")
	public void I_will_add_firstname_and_last_name(DataTable datab) {
		List<List<String>>dat=datab.raw();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys(dat.get(0).get(0));
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys(dat.get(0).get(1));
	}
	
	@Then("^I will click save button$")
	public void I_will_click_save_button() {
		driver.findElement(By.xpath("//*[@id=\'btnSave\']")).click();
	}
	
	@Then("^I will click the edit button$")
	public void I_will_click_the_edit_button() {
		driver.findElement(By.xpath("//*[@id=\'btnSave\']")).click();
		
	}
	
	@When("^I will add extra infomation$")
	public void I_will_add_extra_infomation() {
		driver.findElement(By.id("personal_txtLicExpDate")).clear();
		driver.findElement(By.id("personal_txtLicExpDate")).sendKeys("2020-01-10");
		Select mySelect = new Select(driver.findElement(By.id("personal_cmbMarital")));
		mySelect.selectByVisibleText("Married");
		driver.findElement(By.id("personal_optGender_1")).click();
		Select newSel = new Select(driver.findElement(By.name("personal[cmbNation]")));
		newSel.selectByVisibleText("Pakistani");
		driver.findElement(By.id("personal_DOB")).clear();
		driver.findElement(By.id("personal_DOB")).sendKeys("2018-05-30");
		driver.findElement(By.id("btnSave")).click();
	
	}
	
	@Then("^I will make sure logo is dispayed$")
	public void I_will_make_sure_logo_is_dispayed() {
		boolean b=driver.findElement(By.cssSelector("img[alt='OrangeHRM']")).isDisplayed();
		Assert.assertEquals(true, b);
	}
	
//	@Then("^I will add screenshots$")
//	public void I_will_add_screenshots() throws IOException {
//		TakesScreenshot myScreen = (TakesScreenshot)driver;
//		File source =myScreen.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(source,new File("/Users/waqemhaq/eclipse-workspace/Cucumber/screen"));
////		
//	}

}
