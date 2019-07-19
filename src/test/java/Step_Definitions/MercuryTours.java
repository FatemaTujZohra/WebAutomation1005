package Step_Definitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper_classes.SetDriver;

public class MercuryTours {
	 WebDriver driver;
	    
	    public MercuryTours(){
	        driver = SetDriver.webDriver;
	    }
	    
	
	
	
	@Given("^User goes to http://newtours\\.demoaut\\.com$")
	public void user_goes_to_http_newtours_demoaut_com() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@When("^User click on the Register link on top$")
	public void user_click_on_the_Register_link_on_top() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	}

	@When("^User fills up the registration details$")
	public void user_fills_up_the_registration_details(DataTable DataSet) throws Throwable {
		Map<String, String> DataSetasMap= DataSet.asMap(String.class, String.class);
		driver.findElement(By.name("firstName")).sendKeys(DataSetasMap.get("First Name"));
		Thread.sleep (3000);
		driver.findElement(By.name("lastName")).sendKeys(DataSetasMap.get("Last Name"));
		driver.findElement(By.name("phone")).sendKeys(DataSetasMap.get("Phone"));
		driver.findElement(By.id("userName")).sendKeys("Email");
		driver.findElement(By.name("address1")).sendKeys("Address");
		//driver.findElement(By.name("address2")).sendKeys("Apt 34");
		driver.findElement(By.name("city")).sendKeys("City");
		driver.findElement(By.name("state")).sendKeys("State/Province");
		driver.findElement(By.name("postalCode")).sendKeys("Postal Code");
		driver.findElement(By.name("country")).sendKeys("Country");
		driver.findElement(By.id("email")).sendKeys("User Name");
		driver.findElement(By.name("password")).sendKeys("Password");
		driver.findElement(By.name("confirmPassword")).sendKeys("Confirm Password");
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	@When("^User clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("register")).click();
	}

	@Then("^User verifies the registration is complete$")
	public void user_verifies_the_registration_is_complete() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true, driver.getPageSource().contains("Thank you for registering"));
		Thread.sleep(2000);
	}


}
