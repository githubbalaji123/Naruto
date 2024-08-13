package selenium_basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class whatsapp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.google.com/");
		String g=wd.getCurrentUrl();
	    System.out.println(g);
	    wd.navigate().to("https://www.whatsapp.com/");
	    wd.manage().window().maximize();
	    Thread.sleep(2000);
	    wd.manage().window().minimize();
	    Thread.sleep(2000);
	    wd.manage().window().maximize();
	    Thread.sleep(2000);
	    wd.close();
	}

}
