package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class hwday1 {

	public static void main(String[] args) {
		/*launch chrome browser
		 * click on the register link
		 * fill the register page
		 * click on the register button
		 * navigate back
		 * refresh
		 * close the browser
		 */
		 /* notes : for radio button we have to id()*/
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.navigate().to("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		d.findElement(By.linkText("Register")).click();
		d.findElement(By.id("gender-male")).click();
		d.findElement(By.id("FirstName")).sendKeys("Balaji");
		d.findElement(By.id("LastName")).sendKeys("B");
		d.findElement(By.name("Email")).sendKeys("B2315615@gmail.comm");		
		d.findElement(By.id("Password")).sendKeys("123456");		
		d.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		d.findElement(By.id("register-button")).click();
		d.quit();
	}

}
