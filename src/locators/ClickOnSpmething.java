package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnSpmething {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	Thread.sleep(2000);
	WebElement customerService = 
	driver.findElement(By.xpath("//div[@id='nav-xshop']//a[text()='Customer Service']"));
	WebElement obsuredElement = 
    driver.findElement(By.xpath("//span[@class='a-button-inner']//input[@data-action-type='DISMISS']"));
obsuredElement.click();
Thread.sleep(2000);
customerService.click();
Thread.sleep(5000);


}
}
