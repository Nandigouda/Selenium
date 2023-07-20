package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class isMultiple {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/campaign/landing.php?");
		//identify the the dropdown 
		WebElement dayDrop = driver.findElement(By.xpath("//select[@title='Day']"));
		Select daydropDown=new Select(dayDrop);
		
		if(daydropDown.isMultiple())
		{
			System.out.println("Boolean True");
			System.out.println("Pass  :");
		}
		else {
			System.out.println("Boolean False");
			System.out.println("Fale :");
		}
		Thread.sleep(2000);
		daydropDown.selectByValue("9");
		Thread.sleep(2000);
		WebElement monthDrop = driver.findElement(By.xpath("//select[@title='Month']"));
		Select monDropDown=new Select(monthDrop);
		monDropDown.selectByValue("7");
		Thread.sleep(2000);
		WebElement YearDrop = driver.findElement(By.xpath("//select[@title='Year']"));
		Select yrDropDown=new Select(YearDrop);
		yrDropDown.selectByValue("1996");
		Thread.sleep(2000);
		
		
		driver.manage().window().minimize();
		driver.quit();
		}
	
}
