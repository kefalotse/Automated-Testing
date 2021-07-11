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

public class AddToCart {
	
	WebDriver driver = null;
	
	@Given("user is on automaticpractise page")
	public void user_is_on_automaticpractise_page() {
		
		  System.out.println("Inside Step - browser is open");
		  
		 String projectPath =System.getProperty("user.dir");
		 System.out.println("Project path is :"+projectPath);
		  
		  System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com");
	

	}

	@Given("user clicks on blouse")
	public void user_clicks_on_blouse() throws InterruptedException {
	    
		System.out.println("Inside Step - user hits enter");
		 
	 driver.findElement(By.linkText("Blouse")).sendKeys(Keys.ENTER);
		 
		 Thread.sleep(2000);
	}

	@When("page displays option to add to cart or more")
	public void page_displays_option_to_add_to_cart_or_more() {
	}

	@And("user clicks add to cart")
	public void user_clicks_add_to_cart() throws InterruptedException {
		 driver.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
	}

	@Then("Pop up displays Product succesfully added to your shopping cart")
	public void pop_up_displays_product_succesfully_added_to_your_shopping_cart() {
	}

	@And("user clicks close window icon")
	public void user_clicks_close_window_icon() throws InterruptedException {
		driver.findElement(By.className("cross")).click();
		 Thread.sleep(2000);
		 driver.close();
		 driver.quit();
	}
	
	
	
}
