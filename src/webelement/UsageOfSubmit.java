package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfSubmit {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement formTagRef = driver.findElement(By.tagName("form"));
	//button is a nested element of <form>
	WebElement loginButton = formTagRef.findElement(By.name("login"));
	if (loginButton.getAttribute("type").equals("submit")) {
		loginButton.submit();
	}else {
		System.out.println("Fail: Type Attribute Value is not found as expected.");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}