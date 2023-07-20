package javascriptexecuter;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import basics.ChromeBrowserLauncher;

public class ClickActionByjse {
public static void main(String[] args) {
	
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	 long scrollHeight = (long) jse.executeScript("return document.body.scrollHeight");
	System.out.println("scrollHeight :"+scrollHeight);
	long scrollWidth = (long) jse.executeScript("return document.body.scrollWidth");
	System.out.println("scrollWidth :"+scrollWidth);
	Dimension nsn = driver.manage().window().getSize();
	System.out.println(nsn);
	
	
	
	
	
	
	driver.quit();
	
	
}
}
