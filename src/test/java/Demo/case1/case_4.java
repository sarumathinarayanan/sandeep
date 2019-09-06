package Demo.case1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case_4 {

	WebDriver driver;
	@Given("user in login page")
	public void user_in_login_page()
	{
		System.setProperty("webdriver.chrome.driver","C:\\SARU\\DRIVERS\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@When("user clicks signin")
	public void user_clicks_signin() 
	{
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enter un {string}")
	public void user_enter_un(String string) 
	{
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(string);
	}

	@When("user enter pass {string}")
	public void user_enter_pass(String string) 
	{
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(string);
	}

	@When("user clicks login page")
	public void user_clicks_login_page() 
	{
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@When("user search {string}")
	public void user_search(String string)
	{
		driver.findElement(By.xpath("//*[@id='myInput']")).sendKeys(string);
	}

	@Then("click search button")
	public void click_search_button()
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}



}
