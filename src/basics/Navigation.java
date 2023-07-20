package basics;

import java.net.URL;

public interface Navigation {

	public static final int a2 = 90;
	void back();
	void forward();
	void refresh();
	void to(String url);
	void to(URL url,String url1);
	
}
