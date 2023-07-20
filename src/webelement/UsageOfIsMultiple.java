package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfIsMultiple {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	//identify the <select> as webelement
	WebElement monthDropDown = driver.findElement(By.id("month"));
	//Create the Select Class Object
	Select monthSelect = new Select(monthDropDown);
	if (monthSelect.isMultiple()) {
		System.out.println("Boolean True");
		System.out.println("The Month DropDown is of type Multi Select");
	}else {
		System.out.println("Boolean False");
		System.out.println("The Month DropDown is of type Single Select");
	}
	//Usage of selectByVisibleText()
	monthSelect.selectByVisibleText("Jan");
	Thread.sleep(5000);
	//Usage Of selectByIndex() 
	monthSelect.selectByIndex(8);
	Thread.sleep(5000);
	//Usage of selectByValue()
	monthSelect.selectByValue("12");
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
	
}
}