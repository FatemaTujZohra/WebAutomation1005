package Step_Definitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper_classes.SetDriver;

public class GoogleFooterVerification {
WebDriver driver;
    
    public GoogleFooterVerification(){
        driver = SetDriver.webDriver;
}
   

    @When("^I see google home page$")
    public void i_see_google_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }
  
   

    @Then("^I verified the Google footer list  \"(.*?)\" text$")
    public void i_verified_the_Google_footer_list_text(String arg1, DataTable arg2) throws Throwable {
    	System.out.println("Hello"); 
    	
    	Thread.sleep(4000);
    	List<String> defaultlist= arg2.asList(String.class);
    	
    	
    	Assert.assertEquals(true, driver.getPageSource().contains(defaultlist.get(2)));
    	System.out.println(defaultlist.get(2));
    	Assert.assertEquals(true, driver.getPageSource().contains(defaultlist.get(3)));
    	
    	
		Thread.sleep(2000);
		
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        
    }
    @Then("^I verified the Google footer list text$")
    public void i_verified_the_Google_footer_list_text(DataTable arg1) throws Throwable {
    	
    System.out.println("Hello"); 
    	
    	Thread.sleep(4000);
    	List<String> footers= arg1.asList(String.class);
    
    	
    	
    	Assert.assertEquals(true, driver.getPageSource().contains(footers.get(0)));
    	System.out.println(footers.get(0));
    	Assert.assertEquals(true, driver.getPageSource().contains(footers.get(1)));
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        
    
    
    
}
}  