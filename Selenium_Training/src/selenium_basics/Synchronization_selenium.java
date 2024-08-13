package selenium_basics;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_selenium {

	public static void main(String[] args) throws Exception {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		WebElement stxt=d.findElement(By.id("small-searchterms"));
		d.findElement(By.id("small-searchterms")).sendKeys("computer");
		
		//WebDriverWait is nothing but the explicit wait
	
		WebDriverWait w=new WebDriverWait(d,Duration.ofSeconds(15));
		/* my intime interval is 15sec if it comes please proceed it will not wait for 15 sec just wait to
		 * the actions proceed after the actions done its over its not like Thread.sleep()*/
				//default polling is 500milisec
		w.until(ExpectedConditions.visibilityOf(stxt));
		d.quit();
	}

}
