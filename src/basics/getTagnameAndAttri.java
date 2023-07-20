package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getTagnameAndAttri{
public static void main(String[] args) {
	

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.naukri.com/mnjuser/homepage");
	WebElement naukariLogo = driver.findElement(By.xpath("//a[@alt='Naukri Logo' and @class='nI-gNb-header__logo nI-gNb-company-logo']"));
	String naukari = naukariLogo.getAttribute("alt");
	System.out.println("naukari :"+naukari);
	
	driver.manage().window().minimize();
	driver.quit();
	
	
}
}