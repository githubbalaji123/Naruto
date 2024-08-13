package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMain4Opt {
	public static void main(String[] args) throws InterruptedException 
	{ 
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.get("file:///D:/sn/hotel.html"); 
	WebElement element = driver.findElement(By.id("Hotel taj")); 
	Select sel = new Select(element); 
	sel.selectByIndex(2); 
	Thread.sleep(2000); 
	sel.selectByValue("C"); 
	Thread.sleep(3000); 
	sel.selectByVisibleText("Idly"); 
	Thread.sleep(4000); 
	driver.quit(); 
	}
}
