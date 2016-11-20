package AutoTrial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SigninDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("SIGN-ON")).click();
		WebElement ur = driver.findElement(By.xpath("//input[@name='userName']"));
		ur.sendKeys("KevinShyam");
		Thread.sleep(2000);
		WebElement ps = driver.findElement(By.xpath("//input[@name='password']"));
		ps.sendKeys("KevinShyam07");
		driver.findElement(By.xpath("//input[@alt='Login']")).click();
		Thread.sleep(2000);
		System.out.println ("Sign In is Successful");
	}

}
