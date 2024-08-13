package homework;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium_basics.Webelemnt1stvid;

public class proKabadi {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.prokabaddi.com/standings");
		String team="Gujarat Giants";
		List<WebElement>pts=driver.findElements(By.xpath("//div[@class='table-row-wrap']"));
		List<WebElement>ptn=driver.findElements(By.xpath("//p[text()='"+team+"']/../../../../../../..//div[@class='table-row-wrap']"));
		for(WebElement ele:pts) {
			String ts=ele.getText();
			for(WebElement el:ptn) {
				if(ts.contains(el.getText())) {
					System.out.print(ts);
				}
			}
		break;
		}
	}
}
/* 
 * //p[text()='Haryana Steelers']/../../../../div[@class='table-data matches-play']
 */