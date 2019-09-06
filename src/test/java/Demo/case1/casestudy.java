package Demo.case1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy {
	WebDriver driver;
	@Given("User open the application")
	public void user_open_the_application() {
	    
		System.setProperty("webdriver.chrome.driver","C:\\SARU\\DRIVERS\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@When("User click sign_up button to register")
	public void user_click_sign_up_button_to_register() {
	    
		  driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("User enters the username as {string}")
	public void user_enters_the_username_as(String a) {
		
		 driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(a);
	   
	}

	@When("User enters first name as {string}")
	public void user_enters_first_name_as(String b) {
	    
		 driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(b);
	}

	@When("User enters last name as {string}")
	public void user_enters_last_name_as(String c) {
		
		 driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(c);
	    	
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String d) {
		
		 driver.findElement(By.xpath("//*[@id='password']")).sendKeys(d);
	   
	}

	@When("User enters confirm password as {string}")
	public void user_enters_confirm_password_as(String e) {
		
		 driver.findElement(By.xpath("//*[@id='pass_confirmation']")).sendKeys("saru");
	    
	}
	@When("User enters gender as female")
	public void user_enters_gender_as_female() {
	    
		 driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@When("User enters email as {string}")
	public void user_enters_email_as(String f) {
		
		driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys(f);
	  
	}

	@When("User enters mobile number as {string}")
	public void user_enters_mobile_number_as(String g) {
		
		 driver.findElement(By.xpath("//*[@id='mobileNumber']")).sendKeys(g);
	  
	}

	@When("User enters dob as {string}")
	public void user_enters_dob_as(String h) {
	   
		driver.findElement(By.xpath("//*[@id='dob']")).sendKeys(h);
	}

	@When("User enters address as {string}")
	public void user_enters_address_as(String i) {
		
		  driver.findElement(By.xpath("//*[@id='address']")).sendKeys(i);
	   
	}

	@When("User enters security question")
	public void user_enters_security_question() {
		WebElement que=driver.findElement(By.xpath("//select[@id='securityQuestion']"));
		  Select f=new Select(que);
		  f.selectByVisibleText("What is your Nick Name?");
	    
	}
		

	@When("User enters answer as {string}")
	public void user_enters_answer_as(String m) {
		
		driver.findElement(By.xpath("//*[@id='answer']")).sendKeys(m);
		
	   
	}

	@When("User click register button")
	public void user_click_register_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	  
	}

	@Then("Login Page will display")
	public void login_Page_will_display() {
		
		Assert.assertEquals(driver.getTitle(),"login");
	
	}



}
