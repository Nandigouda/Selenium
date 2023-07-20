package webelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDOBOfAppu {
// DD-MM-YYYY - 17-Mar-1975
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		//select all the drop downs
		WebElement parentEle = driver.findElement(By.id("birthday_wrapper"));
		List<WebElement> allDobDropDowns = parentEle.findElements(By.tagName("select"));
		//System.out.println(allDobDropDowns.size());
		for (WebElement dropdownEle : allDobDropDowns) {
			if (dropdownEle.getAttribute("id").equals("day")) {
				Select daySelect = new Select(dropdownEle);
				daySelect.selectByVisibleText("17");
				System.out.println("Selected Day = " + daySelect.getFirstSelectedOption().getText());
			}else if (dropdownEle.getAttribute("id").equals("month")) {
				Select monthSelect = new Select(dropdownEle);
				System.out.println("Selected Month = " + monthSelect.getFirstSelectedOption().getText());
				monthSelect.selectByIndex(2);
			}else if (dropdownEle.getAttribute("id").equals("year")) {
				Select yearSelect = new Select(dropdownEle);
				yearSelect.selectByVisibleText("1975");
				System.out.println("Selected Year = " + yearSelect.getFirstSelectedOption().getText());
			}	
		}
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}
}