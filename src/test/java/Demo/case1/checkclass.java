package Demo.case1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class checkclass {
	WebDriver driver;

	@Given("use in login page")
	public void use_in_login_page() {
	    
		System.setProperty("webdriver.chrome.driver","C:\\SARU\\DRIVERS\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@When("use search {string}")
	public void use_search(String string) {
		
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys(string);
	  
	}

	@Then("click searchh button")
	public void click_searchh_button() {
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	}

	@Then("click addtocart button")
	public void click_addtocart_button() {
		
		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	    
	}
	@Then("login page should display")
	public void login_page_should_display() {
	 
		
		Assert.assertEquals(driver.getTitle(),"Login");
	}
	
}
