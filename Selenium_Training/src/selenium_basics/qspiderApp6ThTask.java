package selenium_basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class qspiderApp6ThTask {
             //click and hold for 3 seconds 
	public static void main(String[] args) throws Throwable {
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		d.manage().window().maximize();
		WebElement hole=d.findElement(By.id("circle"));
		Actions act=new Actions(d);
		act.clickAndHold(hole).pause(3000).release(hole).perform();

	}

}
