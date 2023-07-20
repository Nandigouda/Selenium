package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookDrop {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new EdgeDriver();

	driver.manage().window().maximize();
	driver.get("https://facebook.com/signup/");
	WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']/../input[@type='radio']"));
	Thread.sleep(5000);
	maleRadio.click();
	
}
}
