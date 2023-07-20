package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getxAndGety {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://www.facebook.com/login/");
		WebElement usernameDimension = driver.findElement(By.name("email"));

		// Dimension of user name text field which returns dimension
		Dimension dimensionOfUsertext = usernameDimension.getRect().getDimension();
		System.out.println("dimensionOfUsertext :" + dimensionOfUsertext);// :(364, 52)

           //location of user name text field which returns point
		Point LocPointOfuserText = usernameDimension.getRect().getPoint();
		System.out.println("LocPointOfuserText : " + LocPointOfuserText); // : (577, 189)

		driver.manage().window().minimize();
		driver.quit();

	}
}
