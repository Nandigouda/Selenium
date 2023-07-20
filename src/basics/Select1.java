package basics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select1 {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		ArrayList l1 = new ArrayList();
		ArrayList l2 = new ArrayList();

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://facebook.com/signup/");
		List<WebElement> FbDrop = driver.findElements(By.tagName("select"));
		for (WebElement fb : FbDrop) {
			if (fb.isDisplayed()) {
				Select options = new Select(fb);
				if (fb.getAttribute("title").equals("Day")) {
					List<WebElement> fbDay = options.getOptions();
					for (WebElement webElement : fbDay) {
						l.add(webElement.getText());

					}
				} else if (fb.getAttribute("title").equals("Month")) {
					List<WebElement> fbDay = options.getOptions();
					for (WebElement webElement : fbDay) {
						l1.add(webElement.getText());

					}

				} else if (fb.getAttribute("title").equals("Year")) {
					List<WebElement> fbDay = options.getOptions();
					for (WebElement webElement : fbDay) {
						l2.add(webElement.getText());
					}
				} else {
					System.out.println("Dropdown is not visible");
				}
			}
		}
		System.out.println(l);
		System.out.println(l1);
		System.out.println(l2);
	}
}
