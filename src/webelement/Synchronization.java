package webelement;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Synchronization {
	public static void main(String[] args) throws Throwable {
		// Blocking the notification popuop
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		// maximizing the browser window
		driver.manage().window().maximize();
		// pre-condition 2 - implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// pass the main URL of the application
		String mainUrl = "https://www.facebook.com/";
		driver.get(mainUrl);
		String expectedLoginPageTitle = "Facebook – log in or sign up";
		System.out.println("expectedLoginPageTitle = " + expectedLoginPageTitle);
		String actualLoginPageTitle = driver.getTitle();
		System.out.println("actualLoginPageTitle = " + actualLoginPageTitle);
		if (actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Pass: The Login Page is displayed upon the verification Of the title.");
		} else {
			System.out.println("Fail: The Login Page is not displayed upon the verification Of the title.");
		}
		// switch to the active ele and enter the user name
		driver.switchTo().activeElement().sendKeys("nikhil.nandigoud");
		// identify the password text field
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		// enter the password
		passwordTextField.sendKeys("Nikhil@123");
		// identify the login button
		WebElement loginButton = driver.findElement(By.name("login"));
		// click on the login button
		loginButton.click();
		String expectedHomePageTitle = "Facebook";
		System.out.println("expectedHomePageTitle = " + expectedHomePageTitle);
		String actualHomePageTitle = driver.getTitle();
		System.out.println("actualHomePageTitle = " + actualHomePageTitle);
		System.out.println("expectedHomepageUrl = " + mainUrl);
		String actualHomePageUrl = driver.getCurrentUrl();
		System.out.println("actualHomePageUrl = " + actualHomePageUrl);
		if (actualHomePageUrl.equals(mainUrl)) {
			System.out.println("Pass: The Home page URL will remain same as that of main URL and it is verified.");
			if (actualHomePageTitle.equals(expectedHomePageTitle)) {
				System.out.println("Pass: The Home page title is found correct and it Is verified.");
				// identify the profilePageMenuOption
				WebElement profilePageMenuOption = driver.findElement(
						By.xpath("//h2[text()='Facebook Menu']/..//a[@href='https://www.facebook.com/ck.swamy.58']"));
				// click on the profilePageMenuOption
				profilePageMenuOption.click();
				// identify the profile Icon
				WebElement profileIcon = driver.findElement(By.xpath("//*[@aria-label='Your profile']"));
				// click on the profile icon
				profileIcon.click();
				// identify the logout option on the profile icon context menu
				WebElement logoutOption = driver.findElement(By.xpath("//div/span[contains(.,'Log Out')]"));
				// click on logout option
				logoutOption.click();
			} else {
				System.out.println("Fail: The Home page title is found incorrect and it Is verified.");
			}
		} else {
			System.out.println("Fail: The Home page URL is not same as that of main URL and it is verified.");
		}
	}
}