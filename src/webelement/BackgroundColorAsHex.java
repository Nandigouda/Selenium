package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackgroundColorAsHex {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		//maximizing the browser window
		driver.manage().window().maximize();
		
		// sending implicit wait time.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// sending explicit time to all driver reference
		WebDriverWait webdriver=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		WebElement loginbutton = driver.findElement(By.name("login"));
		String backGround = loginbutton.getCssValue("background-color");
		
		System.out.println("backGround :"+backGround);
		// chrome=: rgba(24, 119, 242, 1)
		//edge=  :rgba(24, 119, 242, 1)
		//firfox=:rgb(24, 119, 242)
		
		String HexaDecimal = Color.fromString(backGround).asHex();
		System.out.println("HexaDecimal  :"+HexaDecimal);
		//firefox=:#1877f2
		//edge =:#1877f2
		//chrome=:#1877f2
		// the comparison of color should be Hexa decimal value
		//it should not be rgb value because all browser will hav diff color we cannot compare on 
		// -color so we should compare on asHex method
		//it also leads data fluctuation
		driver.manage().window().minimize();
		driver.quit();
		
		
		
		
		
		
		
		
	}
}
