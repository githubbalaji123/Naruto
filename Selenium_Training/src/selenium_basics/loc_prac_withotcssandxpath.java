package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loc_prac_withotcssandxpath {

	public static void main(String[] args) throws InterruptedException {
		//use all loc except css and xpath
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.name("q")).sendKeys("Balaji");
		//d.findElement(By.className("button-1 search-box-button")).click();
		d.findElement(By.id("small-searchterms")).clear();
		d.findElement(By.linkText("Register")).click();
		d.navigate().back();
		d.findElement(By.partialLinkText("Compu")).click();
		Thread.sleep(2000);
		d.navigate().back();
		d.close();
	}
}
