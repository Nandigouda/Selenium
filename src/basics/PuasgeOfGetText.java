package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PuasgeOfGetText {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement adminTagtext = driver.findElement(By.xpath("//b[text()='admin']"));
		String adminTagtext1 = adminTagtext.getText();
		
		System.out.println("adminTagtext1 :"+adminTagtext1);
		
		driver.manage().window().minimize();
		driver.quit();
		
		
		
	}

}
