package selenium_basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Irctc {

	public static void main(String[] args) throws Throwable {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver d= new ChromeDriver(opt);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.irctc.co.in/nget/train-search");
		d.manage().window().maximize();
		String parentWindow= d.getWindowHandle();
		d.findElement(By.xpath("//a[@href='https://www.bus.irctc.co.in/']")).click();
		Set<String> childWindoe=d.getWindowHandles();
		String pgti=d.getTitle();
		System.out.println(pgti);
		for(String window:childWindoe) {
			 d.switchTo().window(window);
			 if (d.getTitle().contains("IRCTC Bus - Online Bus Ticket Booking | Bus Reservation"))
			 {
				d.findElement(By.xpath("//a[text()='Login']")).click();
				Thread.sleep(3000);
				d.close();
			}
		 }	
	}
}
