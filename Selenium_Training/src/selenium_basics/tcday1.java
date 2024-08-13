package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class tcday1 {

	public static void main(String[] args) throws InterruptedException {
		/*launch the chrome browser
		 * navigate to demo web shop
		 * enter the mobile in search text field
		 * click on the register link
		 * navigate back
		 * then click on the login
		 * and navigate back
		 * then enter balaji.com in subscribe text field
		 * then click on the subscribe button
		 * then refresh
		 * then click on the search button i previously enter mobile 
		 * navigate back and quit*/
		
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.google.com");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.navigate().to("https://demowebshop.tricentis.com/");
		dr.findElement(By.className("search-box-text")).sendKeys("mobiles");
		dr.manage().window().maximize();
	//	Thread.sleep(2000);
		dr.findElement(By.linkText("Register")).click();
		//Thread.sleep(3000);
		dr.navigate().back();
		dr.navigate().forward();
		dr.findElement(By.linkText("Log in")).click();
		dr.navigate().back();
		dr.findElement(By.className("ico-login")).click();
		dr.findElement(By.className("email")).sendKeys("balajiciv15@gmail.com");
		dr.navigate().back();
		dr.findElement(By.name("NewsletterEmail")).sendKeys("balaji.com");
		dr.navigate().back();
		dr.findElement(By.className("newsletter-subscribe-button")).click();
	//	Thread.sleep(3000);
		dr.navigate().refresh();
		dr.findElement(By.className("search-box-text")).sendKeys("mobiles");
		dr.findElement(By.className("search-box-text")).clear();
		dr.close();
	}
}
