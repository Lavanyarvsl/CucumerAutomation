package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactFormStepDefinitionTableMap {
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
	
/*	@When("^User enters Firstname and Lastname and Country$")
	 public void user_enters_Firstname_and_Lastname_and_Country() throws Throwable {
		driver.findElement(By.cssSelector("input.firstname")).sendKeys("Lavanya");
		driver.findElement(By.cssSelector("input#lname")).sendKeys("R");
		driver.findElement(By.cssSelector("input[name=country]")).sendKeys("India");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.cssSelector("textarea#subject")).sendKeys("Cucumber Test");
	 }
	*/
	/*
	@When("^User enters \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	 public void user_enters_Firstname_and_Lastname_and_Country(String firstName,String lastName,String country) throws Throwable {
		driver.findElement(By.cssSelector("input.firstname")).sendKeys(firstName);
		driver.findElement(By.cssSelector("input#lname")).sendKeys(lastName);
		driver.findElement(By.cssSelector("input[name=country]")).sendKeys(country);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.cssSelector("textarea#subject")).sendKeys("Cucumber Test");
	 }
	*/
	@When("^User enters Firstname and Lastname and Country$")
	 public void user_enters_Firstname_and_Lastname_and_Country(DataTable conDet) throws Throwable {
		
		for (Map<String, String> data : conDet.asMaps(String.class, String.class)) {
			
			driver.findElement(By.cssSelector("input.firstname")).sendKeys(data.get("Firstname"));
			driver.findElement(By.cssSelector("input#lname")).sendKeys(data.get("Lastname"));
			driver.findElement(By.cssSelector("input[name=country]")).sendKeys(data.get("Country"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			driver.findElement(By.cssSelector("input[type=submit]")).click(); driver.get("https://demoqa.com/html-contact-form/");
	        driver.manage().window().maximize();
		}
		
		
	 }
	
	/*@When("^When user enters Subject$")
	 public void user_enters_subject(DataTable conDet1) throws Throwable {
		
		for (Map<String, String> data1 : conDet1.asMaps(String.class, String.class)) {
		driver.findElement(By.cssSelector("textarea#subject")).sendKeys(data1.get("Subject"));
		}
	 }*/
	
	/*@When("^Click on Submit button$")
	 public void user_Click_submit_button() throws Throwable {
		driver.findElement(By.cssSelector("input[type=submit]")).click();
	 }*/
	
	@Then("^Message displayed Creation Successfully$")
	 public void message_displayed_Logout_Successfully() throws Throwable {
	        System.out.println("Creation Successfully");
	        driver.quit();
	 }
}
