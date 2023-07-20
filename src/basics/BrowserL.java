package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserL {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.findElement(By.id("input")).click();
	Thread.sleep(2000);
	driver.quit();
		
	}
}
