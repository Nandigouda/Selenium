package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrgDomainNeedsGetTextLargely {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://belurmath.org/ramakrishna-math-bengaluru/");
		String pageTitleHeader = driver.findElement(By.tagName("h1")).getText();
		System.out.println("pageTitleHeader = " + pageTitleHeader);
		String address = driver.findElement(By.xpath("//h3/following-sibling::p")).getText();
		System.out.println(address);
		driver.manage().window().minimize();
		driver.quit();
	}
}