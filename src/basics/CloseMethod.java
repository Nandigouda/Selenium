package basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CloseMethod {
	public static void main(String[] args) throws Throwable {

		// Instantiating browser specific class

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");

		driver.manage().window().maximize();

		Thread.sleep(4000);

		driver.get("https://www.instagram.com/");
		Set<String> windowsUnderControl = driver.getWindowHandles();
		for (String wid : windowsUnderControl) {
			System.out.println(wid);
		}
		System.out.println(windowsUnderControl);

		
		WebDriver windnd = driver.switchTo().newWindow(WindowType.WINDOW);
		System.out.println(windnd);

	}
}
