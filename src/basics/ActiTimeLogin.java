package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) {

		// Instantiating browser specific class
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");

		String ExpectedtitleLoginPage = "actiTIME - Login";

		driver.manage().window().fullscreen();

		String ActualLoginTitle = driver.getTitle();

		String ExpectedLoginPageUrl = "https://demo.actitime.com/login.do";

		String ActualLoginpageUrl = driver.getCurrentUrl();

		if (ActualLoginTitle.equals(ExpectedtitleLoginPage)) {
			System.out.println("Loginpage title is correct");
			if (ActualLoginpageUrl.equals(ExpectedLoginPageUrl)) {
				System.out.println("login Page URl is Correct");
				System.out.println("Pass:login page is displaying ");
			} else {
				System.out.println("Login page URl is Incorrect");
			}
		} else {
			System.out.println("Login page Title is incorrect");
		}

		driver.quit();

	}

}
