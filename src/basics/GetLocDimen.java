package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetLocDimen {
public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
	
	driver.get("https://services.ecourts.gov.in/ecourtindia_v6/");
	WebElement textfield = driver.findElement(By.name("cino"));
	Dimension dimension = textfield.getRect().getDimension();
	System.out.println("dimension :"+dimension);
	Point Location = textfield.getRect().getPoint();
	System.out.println("Location :"+Location);
	int startX = textfield.getLocation().getX();
	
	System.out.println("startX :"+startX);
	
	int width = textfield.getSize().getWidth();
	System.out.println("width :"+width);
	
	driver.manage().window().minimize();
	driver.quit();
	
}
}
