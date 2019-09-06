package Demo.case1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case_2 
{
	WebDriver driver;
	@Given("user in login pag")
	public void user_in_login_pag() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\SARU\\DRIVERS\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@When("user clicks signin button")
	public void user_clicks_signin_button() 
	{
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters una {string}")
	public void user_enters_una(String string) 
	{
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(string);
	}

	@When("user enters passwor {string}")
	public void user_enters_passwor(String string)
	{
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(string);
	}

	@Then("click login")
	public void click_login()
	{
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}


	

}
