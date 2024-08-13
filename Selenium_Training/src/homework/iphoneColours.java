package homework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iphoneColours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  driver.get("https://www.amazon.in/Apple-iPhone-Pro-Max-256/dp/B0CHWV2WYK/ref=sr_1_4?crid=135AYKYRWUO10&dib=eyJ2IjoiMSJ9.ISrPaf3T6aI3UGMAazziT7y97-hTEmeHyPm6HMrGE8mKCWLSTjUM3lExE-OB0gQrWIavgGzKAeVw2iScClW174W-KYJkgyAkDWBTFkkiIq0uJxYCt3eWeBmRrOWqgDZHhhU0KzJpCM7YNTfWPhqMNkFueKqTMdC5f9VD53eS-wF6MBb29ax1HdxCiwdHJtkUDd03T4vETTrOAMc5ptB0wev6nVtYYIJBvNseIZDphwk.Xndw6CYc-RBHAn0-o1DcyzYd3Mp1RoZs9O1-U5uIXLc&dib_tag=se&keywords=iphone+15+pro+max&qid=1722270144&sprefix=%2Caps%2C193&sr=8-4");
 String color=driver.findElement(By.xpath("//div[@class='a-row']/..//label[@class='a-form-label']/..//span[@class='selection']")).getText();
	System.out.println(color);
	}
}
