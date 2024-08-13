package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class qspiderapp3rfTask {

	public static void main(String[] args) throws Throwable {
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		d.manage().window().maximize();
		d.findElement(By.id("browserLink1")).click();
		java.util.Set<String> cid = d.getWindowHandles();
		for(String all:cid) 
		{ 
		d.switchTo().window(all); 
		String titles = d.getTitle();
		if(titles.contains("https://demoapps.qspiders.com/ui/browser/SignUpPage")) {
			break;
		}
		}
		d.findElement(By.id("email")).sendKeys("admin");
		d.findElement(By.id("password")).sendKeys("admin");
		d.findElement(By.name("confirmPassword")).sendKeys("admin");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		d.quit();
	}
}
