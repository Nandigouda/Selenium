package webelement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckForbackGroundColor {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement loginButton = driver.findElement(By.name("login"));
	String backgroundColor = loginButton.getCssValue("background-color");
	//System.out.println("backgroundColor = " + backgroundColor);
	// chrome - rgba(24, 119, 242, 1)
	// edge - rgba(24, 119, 242, 1)
	//firefox - rgb(24, 119, 242)
	 String after = Color.fromString(backgroundColor).asHex();
	 System.out.println(after);
	 //firefox - #1877f2
	 //edge - #1877f2
	 //chrome - #1877f2
	driver.manage().window().minimize();
	driver.quit();
	}
}