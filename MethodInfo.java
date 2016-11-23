package StepDefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MethodInfo {


	WebDriver driver = new FirefoxDriver();

@Given("^Once Browser is opened, Hit the Home page and click Sign on$")
public void Once_Browser_is_opened_Hit_the_Home_page_and_click_Sign_on(String c) throws Throwable {
	driver.get(c);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.linkText("SIGN-ON")).click();
	Thread.sleep(2000);

}

@When("^I enter all the required Username and password$")
public void I_enter_all_the_required_Username_and_password(String a,String b) throws Throwable {

	WebElement ur = driver.findElement(By.xpath("//input[@name='userName']"));
	ur.sendKeys(a);
	Thread.sleep(2000);
	WebElement ps = driver.findElement(By.xpath("//input[@name='password']"));
	ps.sendKeys(b);
	driver.findElement(By.xpath("//input[@alt='Login']")).click();
	Thread.sleep(2000);
	

}

@Then("^The Customer should be navigated to Booking page successfully$")
public void The_Customer_should_be_navigated_to_Booking_page_successfully() throws Throwable {

	System.out.println ("Sign In is Successful");
}


	
}
