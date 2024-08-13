package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_screenShot {
       
	       /* basically we have to do typcasting takescreeenshot for ur driverinstance*/
	public static void main(String[] args) throws IOException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.get("https://demowebshop.tricentis.com/");
		
         /*Type cast to get the capability of takeScreenShot inteface to the Driver instance*/
		
		//Temporary location
		TakesScreenshot ts=(TakesScreenshot)d;
		File scrfile=ts.getScreenshotAs(OutputType.FILE);
		
		//destination file  :-> here " . " represents the current project folder
		File destfile =new File("./ScreenShots/HomePage.png");
		
		FileHandler.copy(scrfile, destfile);
		
		System.out.println("home page launched successfully");
		
		//taking a screenshot for a webelement
		WebElement wb=d.findElement(By.id("small-searchterms"));
		wb.sendKeys("Balaji");
		
		File scr=wb.getScreenshotAs(OutputType.FILE);
		File desfileofWebele=new File("./ScreenShots/Searchbar.png");
		FileHandler.copy(scr, desfileofWebele);
	
		d.close();
	}
}
