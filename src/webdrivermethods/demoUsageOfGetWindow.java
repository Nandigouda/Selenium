package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import basics.ChromeBrowserLauncher;

public class demoUsageOfGetWindow {

	public static void main(String[] args) throws Throwable {
		//insatntiating the browser specific class
		
		WebDriver driver=new ChromeDriver();
		//Maximize the current window by driver reference
		driver.manage().window().maximize();
		//passing the main URL oF App
		driver.get("https://demoqa.com/browser-windows");
		
		Thread.sleep(2000);
		//find the new window button click
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
	String getWindowId = driver.getWindowHandle();
		Set<String> allWindowsId = driver.getWindowHandles();
		for (String wid : allWindowsId) {
			String windowUrl = driver.switchTo().window(wid).getCurrentUrl();
			System.out.println(windowUrl);
		}
		driver.quit();
		
	}
}
