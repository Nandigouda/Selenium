package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import basics.Webdriver;

public class InAppropriateBehaviourOfIsEnabled {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
		WebElement zipFile = driver.findElement(By.xpath(
				"//td[text()=' Oracle Solaris (x86 systems, 64-bit)']/..//a[contains(@data-file,'SOLARIS.X64_195000_db_home.zip')]"));
		zipFile.click();
		WebElement licenseAcceptCheckBox = driver.findElement(By.xpath("//form[contains(@class,'initialized')]//input[@type='checkbox']"));
		licenseAcceptCheckBox.click();
		WebElement downLoadButton = driver.findElement(By.xpath("//a[text()='Download SOLARIS.X64_195000_db_home.zip']"));
		/*if (downLoadButton.isEnabled()) {
			System.out.println("Boolean True");
			System.out.println("+ve testing Boolean True");
			System.out.println("Pass: The downLoadButton is enabled after selecting the licenseAcceptCheckBox and it is verified.");
		}else {
			System.out.println("Boolean False");
			System.out.println("+ve Testing Boolean True");
			System.out.println("Fail: The downLoadButton is disabled even after selecting the licenseAcceptCheckBox and it is verified.");
		}*/
		//-ve testing 
		
		  if (downLoadButton.isEnabled()) 
		  { System.out.println("Boolean True");
		  System.out.println("-ve testing Boolean False");
		  System.out.println("Fail:The download button is enabled before selecting the checkbox and it is verified." ); }
		  else { System.out.println("Boolean False");
		 System.out.println("-ve Testing Boolean False"); System.out.
		 println("Pass: The Download button is disabled before selecting the checkbox and it is verified."
		 ); 
		 }
		 
		driver.manage().window().minimize();
		driver.quit();
	}
}