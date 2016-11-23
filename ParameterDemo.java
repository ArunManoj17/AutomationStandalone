package AutoTrial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParameterDemo {

	WebDriver driver = new FirefoxDriver();
	
	public void method1(String c) throws InterruptedException
	{
	driver.get(c);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.linkText("SIGN-ON")).click();
	Thread.sleep(2000);
	}
	
	public void method2 (String a, String b) throws InterruptedException
	{
	WebElement ur = driver.findElement(By.xpath("//input[@name='userName']"));
	ur.sendKeys(a);
	Thread.sleep(2000);
	WebElement ps = driver.findElement(By.xpath("//input[@name='password']"));
	ps.sendKeys(b);
	driver.findElement(By.xpath("//input[@alt='Login']")).click();
	Thread.sleep(2000);
	System.out.println ("Sign In is Successful");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{	
		ParameterDemo n = new ParameterDemo();
		n.method1("http://newtours.demoaut.com/");
		n.method2("KevinShyam", "KevinShyam07");
					
	}

}
