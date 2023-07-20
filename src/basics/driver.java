package basics;

import java.net.MalformedURLException;
import java.net.URL;

public class driver {

	
	public static void main(String[] args) throws MalformedURLException {
		
		RemoteNavigation a=new RemoteNavigation(91);
		
	/*a.back();
	a.forward();
	a.refresh();
	a.to("nikhil");
	URL mainurl=new URL("https://facebook.com/");
	a.to(mainurl);*/
		a.navigate().back();

	}
}
