package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLauncher {
	public static void main(String[] args) {
		
		//instantiate browser specific class
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		
	}
	

}
