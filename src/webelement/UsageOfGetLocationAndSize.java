package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfGetLocationAndSize {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 driver.get("https://www.facebook.com/");
	 //username text field
	 WebElement emailTextField = driver.findElement(By.id("email"));
	 Dimension emailSize = emailTextField.getSize();
	 System.out.println(emailSize);
	 int emailWidth = emailSize.getWidth();//width dimension
	 System.out.println("emailWidth = " + emailWidth);
	 int emailHeight = emailSize.getHeight();//height dimension
	 System.out.println("emailHeight = " + emailHeight);
	 Point emailLocation = emailTextField.getLocation();
	 System.out.println(emailLocation);
	 int emailStartX = emailLocation.getX();//xpoint loc
	 System.out.println("emailStartX = " + emailStartX);
	 int emailStartY = emailLocation.getY();//ypoint Loc
	 System.out.println("emailStartY = " + emailStartY);
	 driver.manage().window().minimize();
	 driver.quit();
	 
}
}
