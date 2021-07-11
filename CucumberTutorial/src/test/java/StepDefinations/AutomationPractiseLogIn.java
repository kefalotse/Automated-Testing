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

public class AutomationPractiseLogIn {
	
	WebDriver driver = null;
	
	@Given("user is on automationpractise home page")
	public void user_is_on_automationpractise_home_page() {
		  System.out.println("Inside Step - browser is open");
		  
			 String projectPath =System.getProperty("user.dir");
			 System.out.println("Project path is :"+projectPath);
			  
			  System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.navigate().to("http://automationpractice.com");
	}

	@And("user clicks on signIn tab")
	public void user_clicks_on_sign_in_tab() throws InterruptedException {

		 System.out.println("Inside Step - user clicks signIn");
	
		 driver.findElement(By.className("login")).sendKeys(Keys.ENTER);
		 
		 Thread.sleep(2000);
	 
	}

	@When("automationpractise page redirects to authentication page")
	public void automationpractise_page_redirects_to_authentication_page() {
		
		
	
	}

	@And("user enters Email address and enters Password")
	public void user_enters_email_address_and_enters_password() throws InterruptedException {
		
		driver.findElement(By.id("email")).sendKeys("efie.kefalotse@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("1234567");
		 Thread.sleep(2000);
	}

	@And("clicks on Sign in button")
	public void clicks_on_sign_in_button() throws InterruptedException {
		 System.out.println("Inside Step - user clicks signIn");
			
		 driver.findElement(By.id("SubmitLogin")).sendKeys(Keys.ENTER);
		 
		 Thread.sleep(2000);
		
		 driver.close();
		 driver.quit();
	}

	@Then("user is redirected to Authentification failler error")
	public void user_is_redirected_to_authentification_failler_error() {
	    
	}



	}
	





