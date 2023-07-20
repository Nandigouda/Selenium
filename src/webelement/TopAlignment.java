package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopAlignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/login/identify/?");
		// email text field
		//<form>
		WebElement parentElement = driver.findElement(By.xpath("//form[@id='login_form']"));
		WebElement emailTextField = parentElement.findElement(By.name("email"));
		int emailStartY = emailTextField.getRect().getY();
		System.out.println("emailStartY = " + emailStartY);
		//passoword text field
		WebElement passwordTextField = driver.findElement(By.name("pass"));
		int passwordStartY = passwordTextField.getRect().getY();
		System.out.println("passwordStartY = " + passwordStartY);
		if (emailStartY==passwordStartY) {
			System.out.println("Pass: The Top alignment of email and password textfield is found correct and It Is verified.");
		}else {
			System.out.println("Fail: The Top alignment of email and password textfield is found incorrect and It Is verified.");
		}
		driver.manage().window().minimize();
		driver.quit();
		
	}
}
