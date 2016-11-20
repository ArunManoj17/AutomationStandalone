package AutoTrial;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://newtours.demoaut.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
WebElement v = driver.findElement(By.linkText("REGISTER"));
v.click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name = 'firstName']")).sendKeys("BRUCE");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name = 'lastName']")).sendKeys("WAYNE");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name = 'phone']")).sendKeys("077 1386 9688");
Thread.sleep(2000);
driver.findElement(By.id("userName")).sendKeys("BruceWayne17@gmail.com");
Thread.sleep(2000);
WebElement a1 = driver.findElement(By.xpath("//input[@name = 'address1']"));
a1.sendKeys("31310 Community House Dr");
Thread.sleep(2000);
WebElement a2 = driver.findElement(By.xpath("//input[@name = 'address2']"));
a2.sendKeys("278 Beechwood Drive");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name = 'city']")).sendKeys("City of London");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name = 'state']")).sendKeys("Greater London");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name = 'postalCode']")).sendKeys("E889029");
Thread.sleep(2000);
Select country = new Select(driver.findElement(By.xpath("//select[@name='country']")));
country.selectByVisibleText("UNITED KINGDOM");
Thread.sleep(1000);
WebElement u = driver.findElement(By.id("email"));
u.sendKeys("BruceCorps");
WebElement p = driver.findElement(By.xpath("//input[@name='password']"));
p.sendKeys("BrucWayne1712");
Thread.sleep(1000);
WebElement c = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
c.sendKeys("BrucWayne1712");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='register']")).click();
System.out.println ("Successfully Registered");
//driver.close();

//Thread.sleep(5000);
//driver.findElement(By.linkText("sign-in")).click();

	}
}
