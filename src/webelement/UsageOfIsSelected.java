package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfIsSelected {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/login.do");
	WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
	// -ve Testing
	/*
	 * if (keepLoggedInCheckBox.isSelected()) { System.out.println("Boolean True");
	 * System.out.println("-ve Testing Boolean False"); System.out.
	 * println("Fail: The keepLoggedInCheckBox is selected before selection"); }else
	 * { System.out.println("Boolean False");
	 * System.out.println("-ve Testing Boolean False"); System.out.
	 * println("Pass: The keepLoggedInCheckBox is not selected before selection"); }
	 */
	//+ve testing
	keepLoggedInCheckBox.click();
	if (keepLoggedInCheckBox.isSelected()) {
		System.out.println("Boolean True");
		System.out.println("+ve Testing Boolean True");
		System.out.println("Pass:The keepLoggedInCheckBox is Selected After Selection");
	}else {
		System.out.println("Boolean False");
		System.out.println("+ve Testing Boolean True");
		System.out.println("Fail: The keepLoggedInCheckBox is not Selected even After Selection");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}