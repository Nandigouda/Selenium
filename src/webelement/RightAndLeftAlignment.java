package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightAndLeftAlignment {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 driver.get("https://www.facebook.com/");
	 //email text field
	 WebElement emailTextField = driver.findElement(By.id("email"));
	 Rectangle emailRect = emailTextField.getRect();
	 int  emailStartX=emailRect.getX();
	 int emailStartY=emailRect.getY();
	 int emailWidth = emailRect.getWidth();
	 int emailHeight = emailRect.getHeight();
	 int emailEndX = emailStartX+emailWidth;
	 //password textfield
	 WebElement passwordTextField = driver.findElement(By.id("passContainer"));
	 Rectangle passwordRect = passwordTextField.getRect();
	 int  passwordStartX=passwordRect.getX();
	 int passwordStartY=passwordRect.getY();
	 int passwordWidth = passwordRect.getWidth();
	 int passwordHeight = passwordRect.getHeight();
	 int passwordEndX = passwordStartX+passwordWidth;
	 if (emailStartX==passwordStartX) {
		 System.out.println("emailStartX = " + emailStartX);
		 System.out.println("passwordStartX = " + passwordStartX);
		System.out.println("Pass: The Left ALignment of Email and password textfield is found correct and it is verified.");
	}else {
		System.out.println("emailStartX = " + emailStartX);
		 System.out.println("passwordStartX = " + passwordStartX);
		System.out.println("Fail: The Left ALignment of Email and password textfield is found incorrect and it is verified.");
	}
	 if (emailEndX==passwordEndX) {
		System.out.println("emailEndX = " + emailEndX);
		System.out.println("passwordEndX = " + passwordEndX);
		System.out.println("Pass: The Right Alignment of the email and password textfield is found correct and it is verified.");
	}else {
		System.out.println("emailEndX = " + emailEndX);
		System.out.println("passwordEndX = " + passwordEndX);
		System.out.println("Fail: The Right Alignment of the email and password textfield is found incorrect and it is verified.");
	}
	driver.manage().window().minimize();
	driver.quit();
	 
}
}
