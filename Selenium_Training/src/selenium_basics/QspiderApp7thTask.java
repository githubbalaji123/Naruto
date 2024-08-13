package selenium_basics;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderApp7thTask {
		public static void main(String[] args) throws InterruptedException 
		{ 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in"); 
		List<WebElement> elements = driver.findElements(By.xpath("//a")); 
		int count = elements.size(); 
		System.out.println(count); 
		}
	}
