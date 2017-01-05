import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.html5.*;
import org.openqa.selenium.logging.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.Cookie.Builder;

import io.appium.java_client.*;
import io.appium.java_client.android.*;
import io.appium.java_client.ios.*;

/**
 * For programming samples and updated templates refer to the Perfecto GitHub at: https://github.com/PerfectoCode
 */
public class AppiumTest {

    public static void main(String[] args) throws MalformedURLException, IOException {
        System.out.println("Run started");

        String browserName = "mobileOS";
        DesiredCapabilities capabilities = new DesiredCapabilities(browserName, "", Platform.ANY);
        String host = "partners.perfectomobile.com";
        capabilities.setCapability("user", "test5@tcs.com");
        capabilities.setCapability("password", "Welcome1019");
        System.getProperties().put("https.proxyHost", "172.17.110.12");
        System.getProperties().put("https.proxyPort", "8080");

        //TODO: Change your device ID
        capabilities.setCapability("deviceName", "955B0252C50AFBAFF240E6AC814CF4FB1E9F03CF");

        // Use the automationName capability to define the required framework - Appium (this is the default) or PerfectoMobile.
        capabilities.setCapability("automationName", "Appium");

        // Call this method if you want the script to share the devices with the Perfecto Lab plugin.
        PerfectoLabUtils.setExecutionIdCapability(capabilities, host);

        // Application settings examples.
        // capabilities.setCapability("app", "PRIVATE:applications/Errands.ipa");
        // For Android:
        // capabilities.setCapability("appPackage", "com.google.android.keep");
        // capabilities.setCapability("appActivity", ".activities.BrowseActivity");
        // For iOS:
         capabilities.setCapability("bundleId", "com.apple.Numbers");

        // Add a persona to your script (see https://community.perfectomobile.com/posts/1048047-available-personas)
        //capabilities.setCapability(WindTunnelUtils.WIND_TUNNEL_PERSONA_CAPABILITY, WindTunnelUtils.GEORGIA);

        // Name your script
        // capabilities.setCapability("scriptName", "AppiumTest");

        //AndroidDriver driver = new AndroidDriver(new URL("https://" + host + "/nexperience/perfectomobile/wd/hub"), capabilities);
         IOSDriver driver = new IOSDriver(new URL("https://" + host + "/nexperience/perfectomobile/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        try {
      
    
        
           	
        	TouchAction touchAction1 = new TouchAction(driver);
        	touchAction1.press(305,289).release();
        	driver.performTouchAction(touchAction1);
        	
        	driver.context("NATIVE_APP");
        	driver.findElementByXPath("//*[@label=\"Rename Charting Basics 3\"]").click();
        	
        	Image(driver, "PRIVATE:script\\Apple_iPhone-7_170105_153450.png");
        	
        	
       
        	
        	
            // write your code here

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Retrieve the URL of the Single Test Report, can be saved to your execution summary and used to download the report at a later point
                String reportURL = (String)(driver.getCapabilities().getCapability(WindTunnelUtils.SINGLE_TEST_REPORT_URL_CAPABILITY));

                driver.close();

                // In case you want to download the report or the report attachments, do it here.
                // PerfectoLabUtils.downloadReport(driver, "pdf", "C:\\test\\report");
                // PerfectoLabUtils.downloadAttachment(driver, "video", "C:\\test\\report\\video", "flv");
                // PerfectoLabUtils.downloadAttachment(driver, "image", "C:\\test\\report\\images", "jpg");

            } catch (Exception e) {
                e.printStackTrace();
            }

            driver.quit();
        }

        System.out.println("Run ended");
    }
    public static void Image(IOSDriver driver, String Imgpath)
    {
   Map<String, Object> params3 = new HashMap<>();
   params3.put("content", Imgpath);
   params3.put("screen.top", "17%");
   params3.put("screen.height", "25%");
   params3.put("screen.left", "19%");
   params3.put("screen.width", "64%");
   params3.put("image.top", "69");
   params3.put("image.height", "280");
   params3.put("image.left", "38");
   params3.put("image.width", "364");
   params3.put("timeout", "5");
   Object result3 = driver.executeScript("mobile:image:find", params3);
    } 
    
}
