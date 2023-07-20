package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EdgeBrowserLauncher {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.youtube.com/watch?v=9St0jNL2QI4");
	String gettitle = d1.getTitle();
	String getCurrenttite = d1.getCurrentUrl();
	System.out.println(getCurrenttite);
	System.out.println(gettitle);
	d1.quit();
	}

}
