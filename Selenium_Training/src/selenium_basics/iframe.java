package selenium_basics;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class iframe {

	public static void main(String[] args) throws Exception{
		/*working with i frames
		 * From a testing perspective when there is a iframe tag u cannot go and identify the webelement
		 * directly when you try to do that there will be a NOSUCHELEMENT will occur
		 *  *********************  SOLUTION:****************
		 *            1st from the main page u have to switch to the frame then perform all ur 
		 *        action then u will have to switch back to the main page
		 *        
		 * Syntax
		 * iframes- Switch by index (so these mtd are overloaded mtd)
		 * d.switchTo().frame(0); //frameid starts from zero indexing
		 * 
		 * i frames-Switch by Webelement
		 * d.switchTo().frame(d.findElement(By.tagName("")));
		 * 
		 * in order to give the control back to the main page, i.e Change the control from frame or
		 * to exit from the frame we use the following methods.
		 * 
		 * driver.switchTo().defaultContent(); //the control from the frame will switch back to the main frame
		 * driver.switchTo().parentFrame();
		 */
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/ASUS/Documents/iframe.html");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		//switch to frame by index
	    	d.switchTo().frame(0);
		
            d.findElement(By.id("small-searchterms")).sendKeys("mobiles");
            d.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
            
            Thread.sleep(2000);
            
            //switch back to main page
                                           // d.switchTo().parentFrame(); we can use this also based on what
                                               //frame and what code of instruction we are in
           d.switchTo().defaultContent();
            d.findElement(By.xpath("(//a[contains(text(),'Google')])[1]")).click();
		Thread.sleep(2000);
               d.close();       
	}
}
