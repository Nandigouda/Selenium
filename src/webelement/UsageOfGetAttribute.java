package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfGetAttribute {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
	 driver.get("https://demo.actitime.com/");
	 //Identify the UN textfield
	 WebElement usernameTextField = driver.findElement(By.id("keepLoggedInCheckBox"));
	 String attvalue = usernameTextField.getAttribute("title");
	 System.out.println("attvalue = " + attvalue);
	 
	 
}
}
