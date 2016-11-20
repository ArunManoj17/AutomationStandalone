package AutoTrial;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WasteDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://newtours.demoaut.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
WebElement v = driver.findElement(By.linkText("REGISTER"));
v.click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name = 'firstName']")).sendKeys("KUMAR");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name = 'lastName']")).sendKeys("SHYAM");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name = 'phone']")).sendKeys("012 1386 9688");
Thread.sleep(2000);
driver.findElement(By.id("userName")).sendKeys("KumarShyam07@gmail.com");
Thread.sleep(2000);
WebElement a1 = driver.findElement(By.xpath("//input[@name = 'address1']"));
a1.sendKeys("55010 Dividend House Sr");
Thread.sleep(2000);
WebElement a2 = driver.findElement(By.xpath("//input[@name = 'address2']"));
a2.sendKeys("101 Beechwood Street");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name = 'city']")).sendKeys("Chennai");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name = 'state']")).sendKeys("TAMIL NADU");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name = 'postalCode']")).sendKeys("600008");
Thread.sleep(2000);
Select country = new Select(driver.findElement(By.xpath("//select[@name='country']")));
country.selectByVisibleText("INDIA");
Thread.sleep(1000);
WebElement u = driver.findElement(By.id("email"));
u.sendKeys("KumarShyam");
WebElement p = driver.findElement(By.xpath("//input[@name='password']"));
p.sendKeys("KumarShyam07");
Thread.sleep(1000);
WebElement c = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
c.sendKeys("KumarShyam07");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='register']")).click();
System.out.println ("Successfully Registered");
Thread.sleep(7000);
driver.findElement(By.linkText("sign-in")).click();
WebElement ur = driver.findElement(By.xpath("//input[@name='userName']"));
ur.sendKeys("KumarShyam");
Thread.sleep(2000);
WebElement ps = driver.findElement(By.xpath("//input[@name='password']"));
ps.sendKeys("KumarShyam07");
driver.findElement(By.xpath("//input[@alt='Login']")).click();
Thread.sleep(2000);
System.out.println ("Sign In is Successful");
	}
}
