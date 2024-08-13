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
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_with_fluent_wait {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		WebElement stxt=d.findElement(By.id("small-searchterms"));
		//fluent wait
		FluentWait fw=new FluentWait(d);
		fw.pollingEvery(Duration.ofSeconds(1));
		fw.withTimeout(Duration.ofSeconds(15));
		fw.until(ExpectedConditions.elementToBeClickable(d.findElement(By.id("small-searchterms"))));
		d.findElement(By.id("small-searchterms")).sendKeys("computer");
		d.findElement(By.xpath("//input[@type='submit'][1]")).click();
		
		WebElement spg=d.findElement(By.xpath("//input[@type='text'][1]"));
		
		fw.pollingEvery(Duration.ofSeconds(1));
		fw.withTimeout(Duration.ofSeconds(15));
		fw.until(ExpectedConditions.visibilityOf(spg));
		
		d.quit();
		
		

	}

}
