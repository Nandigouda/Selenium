package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loca {

	public static void main(String[] args) throws Throwable {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone+13&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_1_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_1_na_na_na&as-pos=1&as-type=RECENT&suggestionId=iphone+13%7CMobiles&requestId=25f4dee4-0437-43fe-bd75-5c0515f65e1e&as-searchtext=i");
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("//div[contains(@aria-label,'Accessible login button')]//span//span[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1");
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();*/
		driver.findElement(By.xpath("//span[@class='f3A4_V']/label[@class='_2iDkf8']/input[@type='checkbox']")).click();
		
		
	}

}
