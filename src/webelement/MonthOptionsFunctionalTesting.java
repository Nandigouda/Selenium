package webelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MonthOptionsFunctionalTesting {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		Select monthSelect = new Select(driver.findElement(By.id("month")));
		List<WebElement> allMonthOptions = monthSelect.getOptions();
		for (WebElement monthOption : allMonthOptions) {
			String visibleText = monthOption.getText();
			monthSelect.selectByVisibleText(visibleText);
			if (monthOption.isSelected()) {
				System.out.println(visibleText + " is Selected");
			}else {
				System.out.println(visibleText + " is not Selected");
			}
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}