package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc3vid {

	public static void main(String[] args) throws InterruptedException {
		/*
		 Xpaths
		 
		 Absoulte xpath
		 relative xpath :  using normal tagname
		                   tagname with indexing
		                   tagname with text()
		                   contains
		                   contains with indexing
		                   contains with text()
		                   Starts-with using Tag,Tag(indexing) and text()
		                   Ends-with tag,text()
		                   Ancester & descendant
		                   preceding & following - sibling :----> parent
		                                                          preceding - sibling
		                                                          following - sibling
		                   SVG Tag
		                   SVG Tag(indexing) 
		                   traversing to the childNode
		                   
		                   Relative Locators
		                   
		                   above(),toRightOf(),toLeftOf(),near(),below() */
		
		          WebDriver d=new ChromeDriver();
		          d.get("https://www.google.com");
		         // d.navigate().to("https://demowebshop.tricentis.com/");
		          d.manage().window().maximize();
		          Thread.sleep(1000);
		          d.findElement(By.name("q")).sendKeys("balaji");
		          Thread.sleep(1000);
		          d.findElement(By.name("q")).clear();
		          
		         
		          //using normal xpath by tagname click on the search bar and register link
//		          d.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
//		          d.findElements(By.xpath("//input[@type='text']")).clear();
//		          d.findElement(By.xpath("//a[text()='Register']")).submit();
		    
//		     // { 
//		          //using normal Xpath by tagname use subscribe search bar with indexing and enter Balaji
//		             d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Balalji");
//		             Thread.sleep(2000);
//		           //using normal Xpath by text() go to the login page   
//		             /* it will not come bcoz of the space in btm the log and in
//		             d.findElement(By.xpath("//a[text()='Log in']"));  so use contains method*/
//		          d.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();   
//		             
	}

}
