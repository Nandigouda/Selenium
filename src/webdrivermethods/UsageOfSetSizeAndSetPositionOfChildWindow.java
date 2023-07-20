package webdrivermethods;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetSizeAndSetPositionOfChildWindow {
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
			driver.manage().window().fullscreen();
		}else if (windowUrl.equals("https://demoqa.com/sample")) {
				Dimension targetChildWindowSize = new Dimension(700, 200);
				driver.manage().window().setSize(targetChildWindowSize);
				Thread.sleep(5000);
				Point targetChildWindowPosition = new Point(100, 100);
				driver.manage().window().setPosition(targetChildWindowPosition);
		}
	}
	//driver.quit();
}
}