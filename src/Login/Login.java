
package Login;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class Login {
	
	//static SafariDriver driver = new SafariDriver();
	public static void main (String [] args)
	{
	//System.setProperty("webdriver.chrome.driver", "/D:/chromedriver.exe");
		
		
		String Username="gulama";
		String Accekkey="pCrZZs7iJl2gIDMX1M865rqOMliu22aCgzWYUh726b8XPEEquI";
		String GridUrl="@hub.lambdatest.com/wd/hub";
		try{
			
		ChromeOptions options= new ChromeOptions();
		//FirefoxOptions options = new FirefoxOptions();
		
		//SafariOptions options = new SafariOptions ();
		//options.setCapability("platform", "MacOS Big sur");
		//options.setCapability("browserVersion","14.0");
		RemoteWebDriver driver = new RemoteWebDriver(new URL ("https://"+Username+":"+Accekkey+GridUrl),options);
		System.out.println(driver);
	    driver.get("https://accounts.lambdatest.com/login");
	    driver.findElement(By.name("email")).sendKeys("gulama@lambdatest.com");
	    driver.findElement(By.name("password")).sendKeys("**********");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.manage().window().maximize();
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
