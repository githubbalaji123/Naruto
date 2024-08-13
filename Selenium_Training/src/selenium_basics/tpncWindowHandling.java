package selenium_basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tpncWindowHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tnpsc.gov.in/English/other-psc.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String pw=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Links']")).click();
		driver.findElement(By.xpath("(//a[@class='confirmation'])[5]")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Set<String> frdtcw=driver.getWindowHandles();
		for (String str : frdtcw) {
			driver.switchTo().window(str);
			if (driver.getTitle().contains("Welcome to UPSC | UPSC")) {
				WebElement spsc=driver.findElement(By.xpath("//a[contains(text(),'State Public Service Commissions')]"));	
				spsc.click();
			}
		}
		frdtcw=driver.getWindowHandles();
		  for (String string : frdtcw) {
			  driver.switchTo().window(string);
			if (driver.getTitle().contains("State Public Service Commissions")) {
				driver.findElement(By.xpath("//a[@href='http://psc.cg.gov.in/']")).click();
			}
		}
		driver.switchTo().window(pw);
		driver.quit();

	}

}
