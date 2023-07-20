package webdrivermethods;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfToUrlurl {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dassault-aviation.com/en/");
	//build and trigger the groups page URL
	URL mainUrl = new URL("https://www.dassault-aviation.com/en/");
	URL groupsPageUrl = new URL(mainUrl, "group/");
	driver.navigate().to(groupsPageUrl);
	Thread.sleep(2000);
URL defencePageUrl= new URL(mainUrl, "defense/");
driver.navigate().to(defencePageUrl);
URL civilPageURl = new URL(mainUrl, "civil/");
driver.navigate().to(civilPageURl);
Thread.sleep(2000);

URL spacePageurl = new URL(mainUrl, "space/");
driver.navigate().to(spacePageurl);
Thread.sleep(2000);

URL passionPageurl=new URL(mainUrl, "passion/");
driver.navigate().to(passionPageurl);


}}
/*   https://www.dassault-aviation.com/en/
group/
defense/
civil/
space/
passion/   */