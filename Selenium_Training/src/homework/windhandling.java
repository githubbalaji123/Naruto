package homework;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		driver.findElement(By.id("browserButton2")).click();
		String pw=driver.getWindowHandle();
		Set<String>cw=driver.getWindowHandles();
		for(String window:cw) {
			driver.switchTo().window(window);
			String url=driver.getCurrentUrl();
			if (url.contains("https://demoapps.qspiders.com/ui/browser/SignUp")) {
				driver.findElement(By.id("username")).sendKeys("ihfh");
				driver.switchTo().window(pw);
				break;
			}
		}
		
	}

}
