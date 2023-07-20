package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InappropriateUsageOfisDisplayed {
public static void main(String[] args) throws Throwable {
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");

	WebDriver driver =new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.flipkart.com/");
	WebElement popupButton = driver.findElement(By.xpath("//button[text()='✕']"));
if (popupButton.isDisplayed()) {
	System.out.println("Boolean True");
	System.out.println("+ve testing element source code is present in the DOM Boolean True");
	System.out.println("Pass: The popupButton is displayed when the sourec code is present in the DOM.");
}else {
	System.out.println("Boolean False");
	System.out.println("+ve testing element source code is present in the DOM Boolean True");
	System.out.println("Fail: The popupButton is not displayed when the source code is  present in the DOM.");
}
	Thread.sleep(5000);
	popupButton.click();
	System.out.println("============================================");
	try {
		boolean ref = popupButton.isDisplayed();
		if (popupButton.isDisplayed()) {
			System.out.println("Boolean True");
			System.out.println("-ve testing element source code is not present in the DOM Boolean True");
			System.out.println("Fail: The popupButton is not displayed when the source code is not present in the DOM.");
		}else {
			System.out.println("Boolean False");
			System.out.println("-ve testing element source code is not present in the DOM Boolean True");
			System.out.println("Pass: The popupButton is not displayed when the source code is  not present in the DOM.");
		}	
	} catch (StaleElementReferenceException e) {
		System.out.println("The Element sourec code itself is not associated with the DOM");
	}
	
	driver.manage().window().minimize();
	driver.quit();
	

}
}