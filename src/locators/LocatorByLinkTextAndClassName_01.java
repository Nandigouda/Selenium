package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByLinkTextAndClassName_01 {
		public static void main(String[] args) throws Throwable {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			//find and click on Forgotten password?
			WebElement forgottenPassword = driver.findElement(By.linkText("Forgotten password?"));
			forgottenPassword.click();
			Thread.sleep(2000);
			//reach back from forgot Password page to login page
			driver.navigate().back();
			//find and click on create a page
			WebElement createAPageLinkText = driver.findElement(By.className("_8esh"));
			createAPageLinkText.click();
			Thread.sleep(5000);
			driver.manage().window().minimize();
			driver.quit();
		}
		}
