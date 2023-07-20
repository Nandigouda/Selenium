package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlignmentOfFBLogin {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://www.facebook.com/login/");
		WebElement userNameText = driver.findElement(By.name("email"));

		WebElement pwdTextField = driver.findElement(By.name("pass"));
		int startXUn = userNameText.getLocation().getX();
		System.out.println("startXUn :" + startXUn);
		int startXpwd = pwdTextField.getLocation().getX();
		System.out.println("startXUn: " + startXUn);
		if (startXUn == startXpwd) {
			System.out.println("pass: Alignment of UN and Pwd is correct and is verified");

		} else {
			System.out.println("pass: Alignment of UN and Pwd is correct and is verified");

		}
		driver.manage().window().minimize();
		driver.quit();

	}

}
