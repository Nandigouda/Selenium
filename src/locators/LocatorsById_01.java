package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsById_01 {
	public static void main(String[] args) throws Throwable {
		//instantiTING BROWSER specific class
		
		WebDriver driver =new ChromeDriver();
		//pre condition-maximize
		driver.manage().window().maximize();
		//pass main URL
		driver.get("https://www.facebook.com/login/");
		//find user name text field and enter text
		WebElement userNameTxtfield = driver.findElement(By.id("email"));
		
		userNameTxtfield.sendKeys("nikhil.nandigoud");
		Thread.sleep(3000);
	    WebElement pwdTxtfield = driver.findElement(By.id("pass"));
		
		pwdTxtfield.sendKeys("3Ae15Cs055");
	
        WebElement loginButton = driver.findElement(By.id("loginbutton"));
		
        loginButton.click();
        driver.quit();
		
		
	}

}
