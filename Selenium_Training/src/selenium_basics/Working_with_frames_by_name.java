package selenium_basics;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_frames_by_name {

	public static void main(String[] args) throws Exception{
	     
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///C:/Users/ASUS/Documents/iframe.html");
		Thread.sleep(2000);
		
		//switch to frame by name
		d.switchTo().frame("frame1");
		d.findElement(By.linkText("Register"));
		Thread.sleep(2000);
		d.switchTo().parentFrame();
		d.findElement(By.linkText("Google")).click();
	}

}
