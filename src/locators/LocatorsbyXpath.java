package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsbyXpath {

	public static void main(String[] args) throws Throwable {
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://money.rediff.com/gainers");
Thread.sleep(2000);
//driver.findElement(By.xpath("//a[starts-with(@href,'//money.rediff.com/companies')]")).click();
 List<WebElement> AllElements = driver.findElements(By.xpath("//table[starts-with(@id,'allpage_links')]//tr[2]//a[starts-with(@href,'//money')]"));
	System.out.println(AllElements.size());
	for (WebElement w : AllElements) {
		String AllLinkText = w.getText();
		System.out.println(AllLinkText);
	}
	driver.quit();
	}
}
