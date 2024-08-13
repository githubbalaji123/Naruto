package selenium_basics;

import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Notification_Popups {

	public static void main(String[] args) throws Exception{
		//working with push notification
	     //this can be handled by using ChromeOptios class
	/*ChromeOption class which will give you the flexibility of ur chrome browser*/
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		 // dont forget to pass the obj into the constructor
	
		WebDriver d=new ChromeDriver(opt);
		d.manage().window().maximize();
		d.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=EAIaIQobChMIss-4k6q3hgMVfKVmAh1uBQM7EAAYASAAEgLZrfD_BwE");
		d.manage().window().maximize();
		
	}

}
