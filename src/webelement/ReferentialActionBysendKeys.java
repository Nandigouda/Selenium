package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReferentialActionBysendKeys {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement UsernameTextField = driver.findElement(By.id("username"));
		
		UsernameTextField.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(4000);
		UsernameTextField.sendKeys("admin");
		UsernameTextField.sendKeys(Keys.TAB);
		Thread.sleep(4000);
		driver.switchTo().activeElement().sendKeys("Test@123");
		Thread.sleep(4000);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		Thread.sleep(4000);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
		
		
	}

}
