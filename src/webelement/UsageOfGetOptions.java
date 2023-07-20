package webelement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfGetOptions {
	public static void main(String[] args) {
		List<String> expectedMonthOptions = new ArrayList<String>();
		expectedMonthOptions.add("Jan");
		expectedMonthOptions.add("Feb");
		expectedMonthOptions.add("Mar");
		expectedMonthOptions.add("Apr");
		expectedMonthOptions.add("May");
		expectedMonthOptions.add("Jun");
		expectedMonthOptions.add("Jul");
		expectedMonthOptions.add("Aug");
		expectedMonthOptions.add("Sep");
		expectedMonthOptions.add("Oct");
		expectedMonthOptions.add("Nov");
		expectedMonthOptions.add("Dec");
		List<String> actualMonthOptions = new ArrayList<String>();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		Select monthSelect = new Select(driver.findElement(By.id("month")));
		List<WebElement> allMonthOptions = monthSelect.getOptions();
		System.out.println("No of Options in the Month DropDown is: " + allMonthOptions.size());
		for (WebElement option : allMonthOptions) {
			String visibleText = option.getText();
			actualMonthOptions.add(visibleText);
		}
		System.out.println(expectedMonthOptions);
		System.out.println(actualMonthOptions);
		if (actualMonthOptions.equals(expectedMonthOptions)) {
			System.out.println("Pass: All the Month Options are found correct and it is verified with it's order.");
		}else {
			System.out.println("Fail: All the Month Options are found incorrect and it is verified with it's order.");
		}
		driver.manage().window().minimize();
		driver.quit();
		
		
	}
}