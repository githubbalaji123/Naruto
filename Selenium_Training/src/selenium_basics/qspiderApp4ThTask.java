package selenium_basics;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qspiderApp4ThTask {

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demoapps.qspiders.com/ui/browser/newTab?sublist=1");
		d.manage().window().maximize();
		d.findElement(By.id("browserButton4")).click();
		Set<String> newwindow=d.getWindowHandles();
		for(String str:newwindow) {
		d.switchTo().window(str);
		String tit=d.getTitle();
			if(tit.contains("https://demoapps.qspiders.com/ui/browser/SignUpPage")) {
				break;
			}
		}
		d.findElement(By.id("email")).sendKeys("admin");
		d.findElement(By.id("password")).sendKeys("admin");
		d.findElement(By.id("confirm-password")).sendKeys("admin");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		d.quit();
	}
}
