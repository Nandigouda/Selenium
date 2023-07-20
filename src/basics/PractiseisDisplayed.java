package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PractiseisDisplayed {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement flipkart = driver.findElement(By.xpath("//button[text()='✕']"));
		if(flipkart.isDisplayed()) {
			
			System.out.println("Boolean True");
			System.out.println("+ve testing is done the X mark is displayed");
			System.out.println("pass:the element is visible and it is verified");
		}
		
		else {
			System.out.println("Boolean false");
			System.out.println("+ve testing is false the X mark is not in dom");
			System.out.println("Fail:the element is not  visible and it is verified");
		}
		flipkart.click();
		
		Thread.sleep(5000);
		try {
			if(flipkart.isDisplayed()) {
				
				System.out.println("Boolean True");
				System.out.println("+ve testing is done the X mark is displayed");
				System.out.println("pass:the element is visible and it is verified");
			}
			
			else {
				System.out.println("Boolean false");
				System.out.println("+ve testing is false the X mark is not in dom");
				System.out.println("Fail:the element is not  visible and it is verified");
			}
			
		}
		catch (StaleElementReferenceException e) {
			
			System.out.println("Exception handeled");
		}
	driver.manage().window().minimize();
	driver.quit();
	}
	
	
	
	
}
