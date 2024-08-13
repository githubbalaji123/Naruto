package homework;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class micTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     ChromeOptions option=new ChromeOptions();
      option.addArguments("use-fake-ui-for-media-stream");
      WebDriver driver=new ChromeDriver(option);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.manage().window().maximize();
      driver.get("https://mictests.com/"); 
     WebElement ele= driver.findElement(By.xpath("//button[@id='mic-launcher']"));
     ele.click(); 
		  Thread.sleep(4000);
		  driver.quit();
	}

}
