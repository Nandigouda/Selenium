package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MethodsOfWebElement {
public static void main(String[] args) {
	
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String mainUrl="https://www.facebook.com/";
	driver.get(mainUrl);
	String expectedLoginPageTitle = "Facebook – log in or sign up";
	System.out.println("expectedLoginPageTitle "+expectedLoginPageTitle);
	String actualLoginPageTitle = driver.getTitle();
	System.out.println("actualLoginPageTitle "+actualLoginPageTitle);
	if (actualLoginPageTitle.equals(expectedLoginPageTitle)) {
		System.out.println("pass: The login page is displayed upon the varification of Title");
		
	}
	else {
		System.out.println("Fail: The login page is not displayed upon the varification of Title");
	}
	driver.switchTo().activeElement().sendKeys("nikhil_nandigoud");
	WebElement passwordTextfield = driver.findElement(By.id("pass"));
	passwordTextfield.sendKeys("Nikhil123");
	WebElement loginButton = driver.findElement(By.xpath("//button[contains(.,'Log in')]"));
	loginButton.click();
	WebElement profileOption = driver.findElement(By.xpath("//*[@aria-label='Your profile']"));
	profileOption.click();
	WebElement logout = driver.findElement(By.xpath("//div/span[contains(.,'Log Out')]"));
	logout.click();
	
}
}
