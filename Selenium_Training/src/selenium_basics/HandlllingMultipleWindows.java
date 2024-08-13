package selenium_basics;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlllingMultipleWindows {
	/* open demo webShop
	 * Click on  FaceBook link on the homepage
	 * enter the email in the email text field on facebook page
	 * then clsoe the facebook window
	 * entr mobiles in the searchtext field on the demo web shop page
	 * and click on search button 
	 * close the browser*
	 * 
	 *    for(String window:childwindows){
	 *    driver.switchTo().window(window);
	 *    if(driver.getTitle().contains("Facebook")){
	 *         driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("balaji@test");
	 *         Thread.sleep(3000);
	 *         driver.close();
	 *         Thread.sleep(3000);
	 *       }
	 *    } 
	 *          driver.switctTo().window(parentwindow);
	 *          Thread.sleep(2000);
	 */
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 //identify the parent window and now switch to child window 
		 
		 String parentWindow=driver.getWindowHandle();
		 System.out.println(parentWindow);
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		 Thread.sleep(3000);
		 
		 Set<String> childWindows=driver.getWindowHandles();
		 System.out.println(childWindows);
		 
		 // remember switch to  the child is by iterate
		 
		 for(String window:childWindows) {
			 driver.switchTo().window(window);
			 if (driver.getTitle().contains("Facebook")) //title la inspect pannni childwindow correct ahh iruntha enter it and fill email
			 {
				 Thread.sleep(3000);
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("balaji@test");
				Thread.sleep(3000);
				driver.close();
			}
		 }
		 
		 //and now i have to switch it back to the parent window
		 
		 driver.switchTo().window(parentWindow);
		 Thread.sleep(3000);
		 
		 
		 driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']")).sendKeys("mobiles");
		 driver.findElement(By.xpath("//input[@value='Search']")).click();
		 driver.quit();
	}

}
