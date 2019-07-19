package Step_Definitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ToolsQA_Table {
	
	public static WebDriver driver;

	@Given("^I go to ToolsQA page$")
	public void i_go_to_ToolsQA_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/");

	}

	@When("^I see ToolsQA webtable page$")
	public void i_see_ToolsQA_webtable_page() throws Throwable {

	}

	@Then("^I verified the ToolsQA table default$")
	public void i_verified_the_ToolsQA_table_default(DataTable arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/");
		driver.manage().window().maximize();

		List<List<String>> data = arg1.raw();

		System.out.println(data.get(0).get(0));
		System.out.println(driver
				.findElement(
						By.xpath("//*[@id=\"post-2924\"]/div[1]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/th[1]"))
				.getText());
		String actualdata = data.get(0).get(0);
		String expecteddata = driver
				.findElement(
						By.xpath("//*[@id=\"post-2924\"]/div[1]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/th[1]"))
				.getText();

		System.out.println("Out expected data:" + expecteddata);

		assertEquals(actualdata, expecteddata);

		System.out.println("Out test Step is finally pass");

		WebElement dfc = driver.findElement(By.xpath("//*[@id=\"post-2924\"]/div[1]/div/div[2]/div/div/div[1]/div/table"));
		//System.out.println(dfc.getText());
		for (int i=0; i<3;i++){
		assertEquals(true, dfc.getText().contains(data.get(0).get(i)));
		System.out.println("Tstdata"+ data.get(0).get(i));
	
	
	

}
}
}
