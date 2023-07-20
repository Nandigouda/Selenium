package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymrphism {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		String browserName="chrome";
		if (browserName.contentEquals("chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (browserName.contentEquals("edge")) {
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		} else {
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			

		}
		
	}

}
