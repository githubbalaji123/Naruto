package selenium_basics;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_frame_by_Webelement {

	public static void main(String[] args) throws Exception{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///C:/Users/ASUS/Documents/iframe.html");
		Thread.sleep(2000);
		
		/*	//switch to frame by webelement
	     WebElement fram=d.findElement(By.id("FR1"));
		d.switchTo().frame(fram).findElement(By.xpath("//a[contains(text(),'Register')][1]")).click();
		              */
		     
		
	              	//switch to frame by webelement
		 d.switchTo().frame(d.findElement(By.id("FR1")));
		 d.findElement(By.id("newsletter-email")).sendKeys("aaa@test");
		 Thread.sleep(2000);
		 d.findElement(By.id("newsletter-subscribe-button")).click();
		 
		/* this will give you NOSELMTEXP
		 *    becoz u are not switching back to parent page and simply accessing it
		 *  d.findElement(By.linkText("Google")).click();
		 */
		 
		     d.switchTo().parentFrame();
		     d.findElement(By.linkText("Google")).click();
		     Thread.sleep(2000);
		     d.close();
	}
}
