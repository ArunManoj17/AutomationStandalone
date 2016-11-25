package AutoTrial;

//import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConsolDemo {

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
	String Expectedtitle = "Find a Flight: Mercury Tours:";
	String Actualtitle = driver.getTitle();
	//System.out.println(Actualtitle);
	Assert.assertEquals(Expectedtitle, Actualtitle);
	System.out.println ("SIGN IN IS Successful");
	}
	
	public static void main(String args [])throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub
	String l,m;
		DataInputStream in = new DataInputStream (System.in);
		System.out.println ("Enter Your UserName");
		l = in.readLine();
		//ur = Integer.parseInt(l);
		Thread.sleep(1000);
		System.out.println ("Enter Your Password");
		m = in.readLine();
		//pd = m;
		Thread.sleep(1000);
		ConsolDemo n = new ConsolDemo();
		n.method1("http://newtours.demoaut.com/");
		n.method2(l, m);
	}

}
