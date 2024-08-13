package selenium_basics;

import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Exception{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		//click on the search button without entering text in search text
		
		d.findElement(By.xpath("//input[@type='submit']")).click();
		
		//handle the alert
		
		Alert ale=d.switchTo().alert();
		Thread.sleep(800);
		ale.accept();
		System.out.println("Alert was handled successfully");
		d.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("alert was handled see the op consle of ur ide");
		Thread.sleep(2000);
		d.close(); 
		// after this automatically comeback to the main page
		
		//handling confirmation alert
		WebDriver dd=new ChromeDriver();
		dd.get("https://demo.guru99.com/test/delete_customer.php");
		dd.manage().window().maximize();
		dd.findElement(By.xpath("//input[@type='text']")).sendKeys("9678");
		dd.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(3000);
		Alert cale=dd.switchTo().alert();
		Thread.sleep(2000);
		dd.switchTo().alert().dismiss();
		System.out.println("cancel is clicked to leave the confirmation alert");
		System.out.println("And the Confirmation alert handled successfully");
		dd.close();
		//
		
		
	}

}
