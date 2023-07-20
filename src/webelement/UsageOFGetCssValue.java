package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOFGetCssValue {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		String fontType = loginButton.getCssValue("font-family");
		System.out.println("fontType = " + fontType);
		String fontSize = loginButton.getCssValue("font-size");
		System.out.println("fontSize = " + fontSize);
		String boldnessOfText = loginButton.getCssValue("font-weight");
		System.out.println("boldnessOfText = " + boldnessOfText);
		driver.manage().window().minimize();
		driver.quit();	
	}
}