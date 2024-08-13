package homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHrm {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		driver.findElement(By.xpath("//input[@name='FullName']")).sendKeys("balaji");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("balaji@gmail.com");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("google");
		driver.findElement(By.xpath("//input[@name='Contact']")).sendKeys("98765433210");
		WebElement ele=driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		
	}

}
