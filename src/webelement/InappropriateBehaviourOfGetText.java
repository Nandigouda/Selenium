package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InappropriateBehaviourOfGetText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		WebElement tdTag = driver.findElement(By.xpath("//td[@id='adminCredentialsHeader']/following-sibling::td"));
		String expectedTdTagText = "Username: ";
		System.out.println("expectedTdTagText = " + expectedTdTagText);
		String actualTdTagText = tdTag.getText();
		System.out.println("actualTdTagText = " + actualTdTagText);
		WebElement bTag = driver.findElement(By.xpath("//td[@id='adminCredentialsHeader']/following-sibling::td/b"));
		String bTagText = bTag.getText();
		System.out.println("bTagText = " + bTagText);
		if (actualTdTagText.equals(expectedTdTagText)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		// getText() will capture both main tag and sub tag text without
		// having the reference of sub tag as web element
		driver.manage().window().minimize();
		driver.quit();
	}
}