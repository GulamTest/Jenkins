package Login;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Tunnel {
	public static void main (String [] args)
	{
	//System.setProperty("webdriver.chrome.driver", "/D:/chromedriver.exe");
		
		
		String Username="gulama";
		String Accekkey="pCrZZs7iJl2gIDMX1M865rqOMliu22aCgzWYUh726b8XPEEquI";
		String GridUrl="@hub.lambdatest.com/wd/hub";
		try{
			
		ChromeOptions options= new ChromeOptions();
		options.setCapability("tunnel",true);
		//FirefoxOptions options = new FirefoxOptions();
		
		//SafariOptions options = new SafariOptions ();
		//options.setCapability("platform", "MacOS Big sur");
		//options.setCapability("browserVersion","14.0");
		RemoteWebDriver driver = new RemoteWebDriver(new URL ("https://"+Username+":"+Accekkey+GridUrl),options);
		System.out.println(driver);
	    driver.get("http://localhost.lambdatest.com/dashboard/virtuoswi/virtuosi-website-master/virtuosi/index.html");
	    driver.findElement(By.xpath("//a[@data-toggle='tab']")).click();
	    
	    driver.quit();
		}
		catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
            //driver.quit(); 
            }
	}

}
