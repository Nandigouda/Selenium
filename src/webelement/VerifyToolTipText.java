package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyToolTipText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/");
		String expectedToolTipText = "Do not select if this computer is shared";
		WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		String actualTooltipText = keepLoggedInCheckBox.getAttribute("title");
		if (actualTooltipText.isEmpty()) {
			System.out.println("Boolean True");
			System.out.println("Tool tip text is not existed.");
		} else {
			System.out.println("Boolean Flase");
			System.out.println("Tool tip text is existed.");
			if (actualTooltipText.equals(expectedToolTipText)) {
				System.out.println("Boolean True");
				System.out.println("Pass: The Tool tip text of <" + keepLoggedInCheckBox.getTagName()
						+ "> is found correct and it is verified.");
			} else {
				System.out.println("Boolean Flase");
				System.out.println("Fail: The Tool tip text of <" + keepLoggedInCheckBox.getTagName()
						+ "> is found incorrect and it is verified.");
			}
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}