package homework;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IccI {

	public static void main(String[] args) throws Throwable {
		 WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://www.icc-cricket.com/rankings/team-rankings/mens/test");
		  String team="Australia";
		  String pos=driver.findElement(By.xpath("//span[text()='"+team+"']/../../../..//div[@class='si-table-data si-pos']")).getText();
		  String tym=driver.findElement(By.xpath("//span[text()='"+team+"']")).getText();
		  
	}

}
