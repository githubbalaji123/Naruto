package selenium_basics;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class JavaScript_executor {
 public static void main(String []args) {
      WebDriver d=new ChromeDriver();
      d.manage().window().maximize();
      d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      d.get("https://demowebshop.tricentis.com/");
       
      //typecasting of javaScript executer with driver instance
      JavascriptExecutor js=(JavascriptExecutor)d;
      js.executeScript("document.getElementById('small-searchterms').value='mobile';");
      WebElement w=d.findElement(By.xpath("//input[@type='submit']"));
	  js.executeScript("arguments[0].click();", w);
	  d.close();
 }
}
