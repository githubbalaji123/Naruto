package selenium_basics;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class cssOnly {
		public static void main(String[] args) throws InterruptedException {
			//use cssSelector only
			
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			d.get("https://demowebshop.tricentis.com/");
			Rectangle rc=d.findElement(By.id("small-searchterms")).getRect();
			rc.toString();
			System.out.println(rc);
			d.findElement(By.cssSelector("input[type='text']")).sendKeys("Balaji");
	}

}
