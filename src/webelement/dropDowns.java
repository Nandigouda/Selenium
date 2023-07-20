package webelement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropDowns {
public static void main(String[] args) throws InterruptedException {
	
	ArrayList alldrop=new ArrayList();
	
			
	WebDriver driver =new EdgeDriver();
	//maximizing the browser window
	driver.manage().window().maximize();
	
	// sending implicit wait time.
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	// sending explicit time to all driver reference
	WebDriverWait webdriver=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.redbus.in/");
	Select drop=new Select(driver.findElement(By.xpath("//*[@id=\"upphoneCode\"]")));
	List<WebElement> allOptions = drop.getOptions();
	for (WebElement allOption : allOptions) {
		String xxxxxxx = allOption.getText();
		alldrop.add(xxxxxxx);
		//System.out.println(xxxxxxx);
	}
               //drop.selectByValue("244");
               
               Thread.sleep(1000);
               
	
	


	/*for (WebElement allDropDowns : allOptions) {
		
			
		System.out.println(allOptions);
		
		
		
	}*/
               System.out.println(alldrop);
	driver.manage().window().minimize();
	driver.quit();
}
}
