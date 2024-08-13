package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class implict_wait {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		
		       /*xxxxxx---------implict wait------xxxxxxx*/
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		d.findElement(By.id("small-searchterms")).sendKeys("computer");
		d.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		d.quit();
	}

}
