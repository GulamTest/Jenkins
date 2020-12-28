package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String [] args)
	{
		System.setProperty("webdriver.gecko.driver", "/D:/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.lambdatest.com/login");
	    driver.findElement(By.name("email")).sendKeys("gulama@lambdatest.com");
	    driver.findElement(By.name("password")).sendKeys("**********");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.manage().window().maximize();
	    driver.quit();
		
	}
}
