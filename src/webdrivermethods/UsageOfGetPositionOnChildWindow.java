package webdrivermethods;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetPositionOnChildWindow {
public static void main(String[] args) throws Throwable {
	//Instantiate the browser specific class 
	WebDriver driver = new ChromeDriver();
	//maximize the browser window
	driver.manage().window().maximize();
	//pass the main URL Of the app
	driver.get("https://demoqa.com/browser-windows");
	//find the new window button and click
	Thread.sleep(2000);
	driver.findElement(By.id("windowButton")).click();
	//capture all the windows id 
	Thread.sleep(2000);
	Set<String> allWindowsId = driver.getWindowHandles();
	for (String wid : allWindowsId) {
		String windowUrl = driver.switchTo().window(wid).getCurrentUrl();
		if (windowUrl.equals("https://demoqa.com/browser-windows")) {
			
		}else if (windowUrl.equals("https://demoqa.com/sample")) {
				Point childWindowPosition = driver.manage().window().getPosition();
				int childWindowStartX = childWindowPosition.getX();
				int childWindowStartY = childWindowPosition.getY();
				System.out.println("childWindowStartX = " + childWindowStartX  + " pix");
				System.out.println("childWindowStartY = " + childWindowStartY  + " pix");
		}
	}
	driver.quit();
}
}
