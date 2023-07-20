package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyThePlaceHolderText {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		// Check for the placeholder text of username
		// pLACEHOLDER text is there or not
		if (username.getAttribute("placeholder").isEmpty()) {
			System.out.println("Username textfield has no placeholder text");
		} else {
			System.out.println("Username textfield has palceholder text");
			// Place holder text is correct or not
			if (username.getAttribute("placeholder").equals("Username")) {
				System.out
						.println("Pass: The Username text field placeholder text is found correct and it is verified.");
				if (username.getAttribute("value").isEmpty()) {
					System.out.println("Pass: Username text field is empty");
					username.sendKeys("admin");

				} else {
					System.out.println("Fail: Username textfield Is not empty and username will not be appended.");
				}

			} else {
				System.out.println(
						"Fail: The Username text field placeholder text is found incorrect and it is verified.");
			}
		}
		// Check for the placeholder text of password
		if (password.getAttribute("placeholder").isEmpty()) {
			System.out.println("Passowrd textfield has no placeholder text");
		} else {
			System.out.println("Passowrd textfiel has palceholder text");
			if (password.getAttribute("placeholder").equals("Password")) {
				System.out
						.println("Pass: The Password text field placeholder text is found correct and it is verified.");
				if (password.getAttribute("value").isEmpty()) {
					System.out.println("Pass: The password textfield is empty.");
					password.sendKeys("manager");
				} else {
					System.out.println(
							"Fail: The password textfield is not empty and the password will not be appended.");
				}
			} else {
				System.out.println(
						"Fail: The Password text field placeholder text is found incorrect and it is verified.");
			}
		}
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}

}