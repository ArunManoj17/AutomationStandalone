package AutoTrial;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ParaDemo {

	WebDriver driver = new FirefoxDriver();
	
	public void Method1 (String z) throws InterruptedException
	{
		driver.get(z);
		//driver.manage().window().maximize();
		driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.linkText("REGISTER")).click();
	}
	
	
	public void Method2 (String d,String e,String f,String g,String h,String i,String j,String k,String l) throws InterruptedException
			{
		Thread.sleep(3000);
		WebElement fn= driver.findElement(By.xpath("//input[@name = 'firstName']"));
		fn.sendKeys(d);
		Thread.sleep(2000);
		WebElement ln = driver.findElement(By.xpath("//input[@name = 'lastName']"));
		ln.sendKeys(e);
		Thread.sleep(2000);
		WebElement ph = driver.findElement(By.xpath("//input[@name = 'phone']"));
		ph.sendKeys(f);
		Thread.sleep(2000);
		WebElement em =driver.findElement(By.id("userName"));
		em.sendKeys(g);
		Thread.sleep(2000);
		WebElement a1 = driver.findElement(By.xpath("//input[@name = 'address1']"));
		a1.sendKeys(h);
		Thread.sleep(2000);
		WebElement a2 = driver.findElement(By.xpath("//input[@name = 'address2']"));
		a2.sendKeys(i);
		Thread.sleep(2000);
		WebElement cy = driver.findElement(By.xpath("//input[@name = 'city']"));
		cy.sendKeys(j);
		Thread.sleep(2000);
		WebElement st = driver.findElement(By.xpath("//input[@name = 'state']"));
		st.sendKeys(k);
		Thread.sleep(2000);
		WebElement pc = driver.findElement(By.xpath("//input[@name = 'postalCode']"));
		pc.sendKeys(l);
		Thread.sleep(2000);
		Select country = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		country.selectByVisibleText("UNITED KINGDOM");
		Thread.sleep(1000);
			}
		
		public void Method3 (String m,String n,String o) throws InterruptedException		
		{
		WebElement u = driver.findElement(By.id("email"));
		u.sendKeys(m);
		WebElement p = driver.findElement(By.xpath("//input[@name='password']"));
		p.sendKeys(n);
		Thread.sleep(1000);
		WebElement cp = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		cp.sendKeys(o);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='register']")).click();
		System.out.println ("Successfully Registered");
		Thread.sleep(7000);
		driver.findElement(By.linkText("sign-in")).click();			
			}
			
	
	public void Method4 (String x, String y) throws InterruptedException
	{
	WebElement ur = driver.findElement(By.xpath("//input[@name='userName']"));
	ur.sendKeys(x);
	Thread.sleep(2000);
	WebElement ps = driver.findElement(By.xpath("//input[@name='password']"));
	ps.sendKeys(y);
	driver.findElement(By.xpath("//input[@alt='Login']")).click();
	Thread.sleep(2000);
	//System.out.println ("Sign In is Successful");
	String Expectedtitle = "Find a Flight: Mercury Tours:";
	String Actualtitle = driver.getTitle();
	Assert.assertEquals(Expectedtitle, Actualtitle);
	System.out.println ("SIGN IN Is Successful");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{	
		ParaDemo n = new ParaDemo();
		n.Method1("http://newtours.demoaut.com/");
		n.Method2("BRUCE","WAYNE","077 1386 9688","BruceWayne17@gmail.com","31310 Community House Dr","278 Beechwood Drive","City of London","Greater London","E889029");
		n.Method3("BruceCorps","BrucWayne1712","BrucWayne1712");
		n.Method4("BruceCorps","BrucWayne1712");
					
	}

}
