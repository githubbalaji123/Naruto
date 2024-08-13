package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class chone {

	public static <javascriptExecutor> void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.co.in");
		String title= d.getTitle();
		System.out.println(title);
		String url= d.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		d.manage().window().maximize();
		d.navigate().to("https://www.flipkart.com/");
		String furl=d.getCurrentUrl();
		System.out.println(furl);
		d.manage().window().minimize();
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(3000);
		d.navigate().forward();
		Thread.sleep(3000);
		d.navigate().back();
		Thread.sleep(2000);
		//d.close();
		d.quit();
	}

}
