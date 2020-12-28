package Login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class TunnelTest {
	
	public String Username="gulama";
	public String Accesskey="**********";
	public String GridURL="@hub.lambdatest.com/wd/hub";
	public static RemoteWebDriver driver = null;
	public String status = null;
	
  
  @BeforeMethod
@BeforeTest
  @org.testng.annotations.Parameters(value={"browser","version","platform", "deviceName"})
  public void setUp(String browser, String version, String platform, String deviceName) {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("browser", browser);
	  capabilities.setCapability("version", version);
	  capabilities.setCapability("platform", platform);
	  capabilities.setCapability("deviceName", deviceName);
	 
		//capabilities.setCapability("platformVersion","6");
	  capabilities.setCapability("tunnel",true);
	  //capabilities.setCapability("build", "LambdaTestSampleApp");
	  //capabilities.setCapability("name", "LambdaTestJavaSample");
		
		try {
			driver = new RemoteWebDriver(new URL("https://" + Username + ":" + Accesskey + GridURL), capabilities );
			
          
      } catch (MalformedURLException e) {
          System.out.println("Invalid grid URL");
      } catch (Exception e) {
          System.out.println(e.getMessage());
      }
  
  }



  @Test
  public void main() throws Exception {
	  driver.get("http://localhost.lambdatest.com/dashboard/virtuoswi/virtuosi-website-master/virtuosi/index.html");
	   driver.findElement(By.xpath("//a[@data-toggle='tab']")).click();
	    
	  
            
        
}  
  @AfterTest
  public void afterTest()throws Exception {
	  if (driver != null) {
		  ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);   
        driver.quit();
}
}
}
