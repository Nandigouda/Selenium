package webelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckForAlternativeImage {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 driver.get("https://www.pib.gov.in/");
	 List<WebElement> allImages = driver.findElements(By.tagName("img"));
	 System.out.println("Total Images found in the WebPage is: " + allImages.size());
	 for (WebElement image : allImages) {
		String imageAlternativeText = image.getAttribute("alt");
		if (imageAlternativeText.isEmpty()) {
			
		}else {
			System.out.println(imageAlternativeText);
		}
	}
	 driver.manage().window().minimize();
	 driver.quit();
	  	
}
}