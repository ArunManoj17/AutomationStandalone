import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import org.openqa.selenium.remote.RemoteWebDriver;

//import com.sun.java.util.jar.pack.Attribute.Layout.Element;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import io.appium.java_client.android.AndroidDriver;
import jdk.internal.util.xml.impl.Input;

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
        capabilities.setCapability("deviceName", "1015FA7BCD813803");

        // Use the automationName capability to define the required framework - Appium (this is the default) or PerfectoMobile.
        capabilities.setCapability("automationName", "Appium");

        // Call this method if you want the script to share the devices with the Perfecto Lab plugin.
        PerfectoLabUtils.setExecutionIdCapability(capabilities, host);

        // Application settings examples.
         //capabilities.setCapability("app", "PUBLIC:sree/selendroid-test-app-0.16.0.apk");
        // For Android:
          capabilities.setCapability("appPackage", "io.selendroid.testapp");
        // capabilities.setCapability("appActivity", ".activities.BrowseActivity");
        // For iOS:
        // capabilities.setCapability("bundleId", "com.yoctoville.errands");

        // Add a persona to your script (see https://community.perfectomobile.com/posts/1048047-available-personas)
        //capabilities.setCapability(WindTunnelUtils.WIND_TUNNEL_PERSONA_CAPABILITY, WindTunnelUtils.GEORGIA);

        // Name your script
        // capabilities.setCapability("scriptName", "AppiumTest");

        AndroidDriver driver = new AndroidDriver(new URL("https://" + host + "/nexperience/perfectomobile/wd/hub"), capabilities);
        // IOSDriver driver = new IOSDriver(new URL("https://" + host + "/nexperience/perfectomobile/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        try {
            // write your code here
       switchToContext(driver, "NATIVE_APP");
       driver.findElementByXPath("//*[@resource-id=\"io.selendroid.testapp:id/startUserRegistration\"]").click();
       
       switchToContext(driver, "NATIVE_APP");
       driver.findElementByXPath("//*[@resource-id=\"io.selendroid.testapp:id/inputUsername\"]").sendKeys("ArunMadhu");
       
       switchToContext(driver, "NATIVE_APP");
       driver.findElementByXPath("//*[@resource-id=\"io.selendroid.testapp:id/inputEmail\"]").sendKeys("trialout@gmail.com");
       
       switchToContext(driver, "NATIVE_APP");
       driver.findElementByXPath("//*[@resource-id=\"io.selendroid.testapp:id/inputPassword\"]").sendKeys("abcd");
       driver.context("NATIVE_APP");
       
       driver.context("NATIVE_APP");
       driver.findElementByXPath("//*[@resource-id=\"io.selendroid.testapp:id/inputName\"]").clear();
       driver.findElementByXPath("//*[@resource-id=\"io.selendroid.testapp:id/inputName\"]").sendKeys("Mr.ABC");
       driver.hideKeyboard();
       driver.context("NATIVE_APP");
       driver.findElementByXPath("//*[@resource-id=\"android:id/text1\"]").click();
       
       driver.context("NATIVE_APP");
       driver.findElementByXPath("//*[@text=\"PHP\"]").click();
       
       driver.context("NATIVE_APP");
       driver.findElementByXPath("//*[@resource-id=\"io.selendroid.testapp:id/input_adds\"]").click();
       
       driver.context("NATIVE_APP");
       driver.findElementByXPath("//*[@resource-id=\"io.selendroid.testapp:id/btnRegisterUser\"]").click();
       
       
     
       
       
       
      //String elements10 = driver.findElementByXPath("//*[@resource-id=\"io.selendroid.testapp:id/inputName\"]").getAttribute("text");
     
       
        	
        	

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
    private static void switchToContext(RemoteWebDriver driver, String context) 
    {
      RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(driver);
      Map<String,String> params = new HashMap<String,String>();
      params.put("name", context);
      executeMethod.execute(DriverCommand.SWITCH_TO_CONTEXT, params);
    }
}
