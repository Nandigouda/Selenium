package basics;

import java.net.MalformedURLException;
import java.net.URL;


	
	public class RemoteNavigation implements Navigation{
         int a1;
        RemoteNavigation (int a2){
         a2=90;
}
public static void main(String[] args) throws MalformedURLException {
	
	RemoteNavigation driver=new RemoteNavigation(91);
	
        /*driver.back();
           driver.forward();
           driver.refresh();
            driver.to("nikhil");
                 URL mainurl=new URL("https://facebook.com/");
               driver.to(mainurl);*/
	driver.navigate().refresh();
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().to("nikhil");
	URL mainurl=new URL("https:");
	driver.navigate().to(mainurl, "sajskj");
	
}

public Navigation navigate() {
	
	return new RemoteNavigation(10);
}

		@Override
		public void back() {
			System.out.println("goes to Previous Webpage in same session:     ");
			System.out.println("==============================================");
			
		}

		@Override
		public void forward() {
System.out.println("goes to immediate next page which we loaded previously in same session :");	
System.out.println("**********************************************");
		}

		@Override
		public void refresh() {
			System.out.println("Reloads the same Webpage one more time :");
			System.out.println("=======*============*=============*===============");
		}

		@Override
		public void to(String url) {
			System.out.println("Triger the sub url :   ");
			System.out.println("Used to Navigate to Sub url of Web application");
			System.out.println("----------------------------------------------------");
		}
		@Override
		public void to(URL url, String url1) {
			// TODO Auto-generated method stub
			System.out.println(" Tirger the child url with the help of URL:    ");
			System.out.println("==================================================");
			
		}

}
