package selenium_basics;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class qspiderApp1stTask {

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demoapps.qspiders.com/ui?scenario=1");
		d.manage().window().maximize();
		d.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement dwb=d.findElement(By.id("select3"));
		Select dropsel = new Select(dwb);
		List<WebElement> drs=dropsel.getOptions();
		for (WebElement web : drs) 
		{ 
		String drls = web.getText(); 
		System.out.println(drls); 
		}
		d.navigate().refresh();
		d.close();
	}
}
