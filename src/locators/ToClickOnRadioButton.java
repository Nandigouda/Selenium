package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basics.FindElementBy_;

public class ToClickOnRadioButton {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/campaign/landing.php?");
//to find the Male Radio button
WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']"));
maleRadioButton.click();
// click method has a default capability of to scorll static web page to some extent 
// the intracbale target element will reach the view port area before clicking
//click on portal option
Thread.sleep(3000);
WebElement portalOption = driver.findElement(By.xpath("//a[text()='Portal']"));
portalOption.click();



	}

}
