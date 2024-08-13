package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new ChromeDriver();
		Thread.sleep(2000);
		dr.get("https://www.google.com/");
		dr.navigate().to("https://demowebshop.tricentis.com/");
		dr.manage().window().maximize();
		
		//------ enter the text in search text field ----------
    
		//  WebElement searchField= dr.findElement(By.name("q"));
      // searchField.sendKeys("mobiles");
                            //or by id instead of name and this is done with mtd chaining
		dr.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		
		
       // ----------------- xxxx -------------
       
            // -------  to Click on the link ("register link on the website") ---------
		
		      dr.findElement(By.linkText("Register")).click();
		                  
		               // ------ xxxx  -----------------
		           
		         Thread.sleep(1000);
		         dr.navigate().back();
		      
		    // -------  to Click on the link ("login link on the website") ---------
		     
		      dr.findElement(By.linkText("Log in")).click();
		      
		         Thread.sleep(1000);
		         dr.navigate().back();
		  
		     // -------  to Click on the link ("Partial link text") --------- 
		         
		     //now we are going to click the Shopping cart by partial link text but we can also use linktext
		                   // instead of Shopping cart we use cart
		        
		         // dr.findElement(By.partialLinkText("cart")).click();
		         
		         dr.findElement(By.partialLinkText("hopping")).click();
		         
		        Thread.sleep(5000);
		         dr.navigate().back();
		 // ------------- xxx --------------------   
		
		    // tag name locator enter the text field in subscribe text field
		         dr.findElement(By.id("small-searchterms")).clear();
		         Thread.sleep(2000);
		         dr.findElement(By.tagName("input")).sendKeys("test@123.com");
		         dr.findElement(By.tagName("input")).clear();
		    
		   // we use to enter the text in the subscribe field but its entering in the search field
		         // why it is doing like this 
		         
		         /* if there is no element it will give the nosuchelement exception*/
		         /* When it has multiple matches it return the first  matching element the
		          * reason y bcoz the locators what we are using in the tag name there could be
		          * multiple matches here the tag name with input i feel the 1st element would have been
		          * search field so it went and enter the text in search field instead of subscribe field
		          * we can find the number of tag name in the 
		          * so instead of tag name we can id or class something for subscribe box*/
		         
		         
		         dr.findElement(By.id("newsletter-email")).sendKeys("balaji.com");
		         Thread.sleep(2000);
		        // Error:- dr.findElement(By.className("button-1 newsletter-subscribe-button")).click();
		           //eventhough we are pasting the crt class name
		         /* why it is not clicking the subscribe button becoz
		          * Compound class names not permitted
		          * because there is space in the class name so we have to do class_chaining by 
		          * using . for eg:- dr.findElement(By.className("button-1.newsletter-subscribe-button")).click();
		          */
		         
		        /* dr.findElement(By.className("button-1.newsletter-subscribe-button")).click();
		         * here also its giving nosuchelement_exception came
		         * dr.findElement(By.className("newsletter-subscribe-button")).click(); by clear the space text
		         */
		         
		         dr.findElement(By.id("newsletter-subscribe-button")).click();
		         dr.navigate().back();
		         dr.navigate().refresh();
		         dr.navigate().forward();
		         
		         
		         
		         //css loactors --> lets us take search bar couple of web elements
		         
		         dr.findElement(By.cssSelector("input[id=\"small-searchterms\"]")).sendKeys("computers");
		         dr.findElement(By.cssSelector("input[class=\"button-1 search-box-button\"]")).click();
		          
		         dr.navigate().back();
		         dr.navigate().refresh();
		         dr.navigate().forward();
		         
		         dr.findElement(By.cssSelector("input[id=\"small-searchterms\"]")).sendKeys("shirt");
		         dr.findElement(By.cssSelector(".button-1.search-box-button")).click();
		         
		        dr.quit();
	}

}
