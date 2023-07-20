package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageofgetSize {

	
	public static void main(String[] args) {
		
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
		 
		 driver.get("https://www.facebook.com/login/");
		 
		 //Dimension of User name Text filed
		 
		// answer===userNameDimension :(363, 51)
		WebElement userNameTexrfiled = driver.findElement(By.name("email"));
		Dimension userNameDimension = userNameTexrfiled.getSize();
		int widthOfUNText = userNameDimension.getWidth();
		int hytOfUnText = userNameDimension.getHeight();
		System.out.println("userNameDimension :"+userNameDimension);// answer===userNameDimension :(363, 51)
		
		//Dimension of password text filed
		
		//
		WebElement passwordTexrfiled = driver.findElement(By.id("pass"));
		Dimension PasswordDimension = userNameTexrfiled.getSize();
		int widthOfpwdText = userNameDimension.getWidth();
		int hytOfpwdText = userNameDimension.getHeight();
		System.out.println("PasswordDimension :"+PasswordDimension);  //PasswordDimension :(363, 51)
		driver.manage().window().minimize();
		driver.quit();
		
				 
	}
}
