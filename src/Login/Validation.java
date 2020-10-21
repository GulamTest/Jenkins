package Login;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Validation {
	
	public static void main(String [] args){
		String Username="gulama";
		String Accekkey="pCrZZs7iJl2gIDMX1M865rqOMliu22aCgzWYUh726b8XPEEquI";
		String GridUrl="@hub.lambdatest.com/wd/hub";
		try{
			
			ChromeOptions options= new ChromeOptions();
            options.setCapability("platform", "Windows 10");
			options.setCapability("browserName", "Chrome");
			options.setCapability("version","86.0");
			options.setCapability("resolution","1280x800");
			RemoteWebDriver driver = new RemoteWebDriver(new URL ("https://"+Username+":"+Accekkey+GridUrl),options);
			System.out.println(driver);
		    driver.get("http://howbigismybrowser.com/");
		    
		    
		   String expected= driver.findElement(By.id("counter")).getText();
		   String actual= "1264 668";
		    //driver.findElement(By.xpath("//span[@class='num']")).getText();
		    
		    System.out.println(expected);
		    if(expected.equals(actual)){
		        System.out.println("Pass");
		    }
		        else {
		            System.out.println("Fail");
		        }
		    driver.quit();
		}
		catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
         
            }
		
	}
	
	
	

}
