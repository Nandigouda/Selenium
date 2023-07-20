package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorByCss_01 {
public static void main(String[] args) {
	 WebDriver driver = new EdgeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://shop-global.malaicha.com/login");
	 //find the sign in button and click on it.
	 WebElement signInButton = driver.findElement(By.cssSelector("button[type='submit']"));
	 signInButton.click();
}
}