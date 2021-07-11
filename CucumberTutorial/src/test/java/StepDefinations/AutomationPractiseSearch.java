package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationPractiseSearch {
	
	WebDriver driver = null;
	
	
	@Given("browser is open")
	public void browser_is_open() {
		
		
	  System.out.println("Inside Step - browser is open");
	  
	 String projectPath =System.getProperty("user.dir");
	 System.out.println("Project path is :"+projectPath);
	  
	  System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		 System.out.println("Inside Step - user is on the Automation Practice Page");
		 
		 driver.navigate().to("http://automationpractice.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		 System.out.println("Inside Step - user enters text in search box");
		 
		 driver.findElement(By.name("search_query")).sendKeys("blouse");
		 
		 Thread.sleep(2000);}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		 System.out.println("Inside Step - user hits enter");
		 
		 driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
		 
		 Thread.sleep(2000);
	}
	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() throws InterruptedException {
		 System.out.println("Inside Step - user is navigated to search results");
		 
		 driver.getPageSource().contains("Top Sellers");
		 
		 Thread.sleep(2000);
		 driver.close();
		 driver.quit();
	}

}
