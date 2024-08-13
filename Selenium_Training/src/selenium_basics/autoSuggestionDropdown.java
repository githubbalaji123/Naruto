package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        
        d.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("compu");
        Thread.sleep(2000); //this bcoz if we not wait then it cant take it fastly in auto suggestion so wait it to open fully 
                           // or otherwise it will give nosuchelement
        d.findElement(By.xpath("//a[contains(text(),'Build your own computer')]")).click();
        
        d.close();
        
        WebDriver dd=new ChromeDriver();
        dd.manage().window().maximize();
        dd.get("https://www.flipkart.com/");
        dd.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("puma");
        Thread.sleep(5000);
        dd.findElement(By.xpath("(//div[contains(@class,'YGcVZO _2VHNef')])[3]")).click();
	}

}
