package selenium_basics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEleprac {

	public static void main(String[] args) {
		// use ever Webelement methods
		 
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.get("https://demowebshop.tricentis.com/");
	            //Getters
		String txt=	d.findElement(By.xpath("//h2[@class='topic-html-content-header']")).getText();
	    System.out.println(txt);
	    String attri=d.findElement(By.xpath("//input[@name='NewsletterEmail']")).getAttribute("name");
	    System.out.println(attri);
	    String cssValue=d.findElement(By.xpath("//strong[contains(text(),'Community poll')]")).getCssValue("color");
	    System.out.println(cssValue);
	    
	    //verification
	    boolean en=d.findElement(By.xpath("(//input[@type='radio'])[1]")).isEnabled();
	    System.out.println(en);
	    boolean sel=d.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
	    System.out.println(sel);
	    boolean dis=d.findElement(By.xpath("(//input[@type='radio'])[1]")).isDisplayed();
	    System.out.println(dis);
	    
	    //Action
	    d.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Balaji");
	    d.findElement(By.xpath("//input[@type='text'][1]")).clear();
	    d.findElement(By.xpath("//input[@type='submit']")).submit();
	    
	    d.quit();
	}
}
