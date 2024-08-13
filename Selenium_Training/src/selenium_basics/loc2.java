package selenium_basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class loc2 {

	public static void main(String[] args) throws InterruptedException {
		
		//xpath
		/* in css expression if there is multiple webelements with the same name
		 * and for eg if the username and password having the same cssExpresion 
		 * then how can we write some text in that both text field so there we are
		 * using the Xpath to over-come the cssExpession
		 * 
		 *  what is the xpath?
		 *  its stands for Xml path  <------this is 1 XXXXXXXXXXXXplzzz see the notesXXXXXXXXX*/
		
		WebDriver d=new ChromeDriver();
		d.navigate().to("file:///C:/Users/ASUS/Documents/emp.html");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("/html/body/input[1]")).sendKeys("Google -->> Balaji");
		d.findElement(By.xpath("/html/body/input[2]")).sendKeys("B &(Meta)");
		d.findElement(By.xpath("/html/body/input[3]")).click();
		d.findElement(By.xpath("/html/body/input[5]")).sendKeys("Google");
		d.findElement(By.xpath("/html/body/input[6]")).sendKeys("Texasus");
		d.findElement(By.xpath("/html/body/input[7]")).click();
		Thread.sleep(3000);
		d.close();
	}
}
