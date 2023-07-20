package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBookWorkOnIsSelected {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		// female radio button
		WebElement femaleRadioButton = driver
				.findElement(By.xpath("//label[text()='Female']/..//input[@type='radio']"));
		WebElement mobileTextField = driver.findElement(By.name("reg_email__"));
		//femaleRadioButton.click();
		//after selection
		mobileTextField.click();
		Thread.sleep(2000);
		//Note: On the Text Field the selection state cannot be evaluated with isSelected()
		// because it will always return boolean false inappropriately irrespective of the state of 
		if (mobileTextField.isSelected()) {
			System.out.println("Boolean True");	
		}else {
			System.out.println("Boolean Flase");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}