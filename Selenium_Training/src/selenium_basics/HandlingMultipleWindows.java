package selenium_basics;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		      //identify the parent window
	          String parentWindow=d.getWindowHandle();
	          System.out.println(parentWindow); // will give alpha numeric value
	          
	          //execute the functionality which will open the child wndow
	          d.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("computer");
	          d.findElement(By.xpath("//input[@type='submit']")).click();
	          Thread.sleep(4000);
	          //get all the window opened (that u have to identify all windows including boht parent and child windows)
	         Set<String> childwindows= d.getWindowHandles();
	         System.out.println(childwindows);
	         
	         //iterate on the set of child windows using switchto mtd
	         for(String window:childwindows) {
	        	 //switching to child window using switchTo() 
	        	 d.switchTo().window(window); //here it is obivously starts from the parent window and switch to the child window
	        	 String title=d.getTitle();
	        	 System.out.println(title);
	         }
	         
	         //switch back to parent window
	         d.switchTo().window(parentWindow);
	         d.close(); //here it will close only the parent window
	         
		}
}
