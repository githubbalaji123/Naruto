package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathsTypes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.navigate().to("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		
		//relative xpath by using @ 
		d.findElement(By.xpath("//a[@class='ico-register']")).click();
		d.navigate().back();
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		d.navigate().refresh();
		
		//relative xpath by using grouping index
		
		d.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("laptop");
		d.navigate().refresh();
		
		//relative xpaths for when we use textattributes ===== >textelement< ======
		
		d.findElement(By.xpath("//a[text()='Register']")).click();
		d.findElement(By.xpath("//a[text()='Log in']")).click(); /*why we are not using @ becoz it should
                                                                   not used in text()attributes...
                                                                   except text attributes */		
		/*we can use @ for any attributes except text*/
		
		//see contains method xpths in the notes
		
		d.findElement(By.xpath("")).click();
		
		
		
	}

}
