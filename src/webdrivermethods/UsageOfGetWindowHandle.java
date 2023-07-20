package webdrivermethods;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandle {
public static void main(String[] args) throws Throwable  {
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//pre-cond - maximize the window
		driver.manage().window().maximize();
		//pass the Main URL of the App
		driver.get("https://demoqa.com/browser-windows");  
		Thread.sleep(2000);
		//find the new window button click
		
		driver.findElement(By.id("windowButton")).click();  ////windowButton  JS
		Thread.sleep(2000);
		//capture the current window ID
		//there are two windows here 
		//getwindowHandle() 
		//it will capture the parent window ID by default
		//it will capture the window ID where the driver is present.
		String windowId = driver.getWindowHandle();
		System.out.println("windowId = " + windowId);
		Set<String> allWindowsId = driver.getWindowHandles();
		for (String wid : allWindowsId) {
			System.out.println(wid);
		}
		driver.quit();
		
	}
	}
