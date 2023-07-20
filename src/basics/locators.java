package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	
	//Maiximize the browser
	driver.manage().window().maximize();
	//enter main URL
driver.get("https://www.facebook.com/");
//WebElement LoginButton = driver.findElement(By.linkText("_1_3w1N"));
//LoginButton.click();

WebElement HaveAnAccount = driver.findElement(By.className("_6ltg"));
HaveAnAccount.click();



	}
}
