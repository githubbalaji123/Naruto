package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class qspiderApp5ThTask {

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		d.manage().window().maximize();
		d.findElement(By.id("browserButton3")).click();
		java.util.Set<String> s=d.getWindowHandles();
		for(String str:s) {
			d.switchTo().window(str);
			String tit=d.getTitle();
			if(tit.contains("https://demoapps.qspiders.com/ui/browser/SignUp")) {
				break;
			}
		}
		d.close();
	}
}
