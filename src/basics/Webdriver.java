package basics;

import java.net.URL;

public interface Webdriver  {
	
	Navigation navigate();
	public interface Navigation {

		void back();
		void forward();
		void refresh();
		void to(String url);
		void to (URL url);
		
	}
	

}
