/*package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactFormStepDefinitionTable {
	public static  String CHROME_KEY = "webdriver.chrome.driver";
	public static final String CHROME_VALUE = "./chromedriver.exe";
	private static WebDriver driver = null;
	//public static JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("^User is on Create Form Page$")
	 public void user_is_on_Home_Page() throws Throwable {
		    System.setProperty(CHROME_KEY,CHROME_VALUE);
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://demoqa.com/html-contact-form/");
	        driver.manage().window().maximize();
	 }
	
	@When("^User enters Firstname and Lastname and Country$")
	 public void user_enters_Firstname_and_Lastname_and_Country() throws Throwable {
		driver.findElement(By.cssSelector("input.firstname")).sendKeys("Lavanya");
		driver.findElement(By.cssSelector("input#lname")).sendKeys("R");
		driver.findElement(By.cssSelector("input[name=country]")).sendKeys("India");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.cssSelector("textarea#subject")).sendKeys("Cucumber Test");
	 }
	
	
	@When("^User enters \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	 public void user_enters_Firstname_and_Lastname_and_Country(String firstName,String lastName,String country) throws Throwable {
		driver.findElement(By.cssSelector("input.firstname")).sendKeys(firstName);
		driver.findElement(By.cssSelector("input#lname")).sendKeys(lastName);
		driver.findElement(By.cssSelector("input[name=country]")).sendKeys(country);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.cssSelector("textarea#subject")).sendKeys("Cucumber Test");
	 }
	
	@When("^User enters Firstname and Lastname and Country$")
	 public void user_enters_Firstname_and_Lastname_and_Country(DataTable conDet) throws Throwable {
		 List<List<String>> conDetValues =  conDet.raw();
		driver.findElement(By.cssSelector("input.firstname")).sendKeys(conDetValues.get(0).get(0));
		driver.findElement(By.cssSelector("input#lname")).sendKeys(conDetValues.get(0).get(1));
		driver.findElement(By.cssSelector("input[name=country]")).sendKeys(conDetValues.get(0).get(2));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.cssSelector("textarea#subject")).sendKeys("Cucumber Test");
	 }
	
	
	
	@When("^Click on Submit button$")
	 public void user_Click_submit_button() throws Throwable {
		driver.findElement(By.cssSelector("input[type=submit]")).click();
	 }
	
	@Then("^Message displayed Creation Successfully$")
	 public void message_displayed_Logout_Successfully() throws Throwable {
	        System.out.println("Creation Successfully");
	        driver.quit();
	 }
}
*/