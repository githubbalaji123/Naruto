package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qspiderapp2ndTask {

	public static void main(String[] args) throws Throwable {
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demoapps.qspiders.com/ui?scenario=1");
		d.manage().window().maximize();
		d.findElement(By.xpath("//li[contains(@class,\"relative flex items-center justify-between  ps-5 pe-2 text-[15px] bg-gradient-to-r from-orange-400 to-orange-600 text-white rounded-e-sm py-1 mt-1 cursor-pointer\")]")).click();
		d.findElement(By.xpath("(//li[contains(@class,'relative flex items-center justify-between  ps-5 pe-2 text-[15px] text-black rounded-e-sm py-1 mt-1 cursor-pointer')])[1]")).click();
		d.findElement(By.xpath("//a[@href='/ui/alert']")).click();
		d.findElement(By.id("buttonAlert2")).click();
		Thread.sleep(2000);
		Alert alt = d.switchTo().alert(); 
		alt.accept(); 
	}
}
