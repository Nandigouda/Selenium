package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UsageOfGetAttribute {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//identify the username text field
		WebElement usernameTextField = driver.findElement(By.id("username"));
		String typeAttValue = usernameTextField.getAttribute("type");
		
		System.out.println("typeAttValue is > "+ typeAttValue);
		String nameAttValue = usernameTextField.getAttribute("name");
		System.out.println("nameAttValue is > "+ nameAttValue);
		String valueAttValue = usernameTextField.getAttribute("value");
		//verify the given att value in the ele source code is empty or not
		if (valueAttValue.isEmpty()) {
			System.out.println("Value Att Is empty");
		}else {
			System.out.println(valueAttValue);
			System.out.println("Value att is not empty");
		}
		// what If the unknown attribute has called....!?
		
	System.out.println(usernameTextField.getAttribute("src"));
		driver.manage().window().minimize();
		driver.quit();
	}
}