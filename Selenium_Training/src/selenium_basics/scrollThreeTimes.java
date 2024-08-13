package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollThreeTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=7578002000488944993&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061917&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		d.manage().window().maximize();
		Actions act=new Actions(d);
		for (int i = 0; i<3; i++) {
			act.scrollByAmount(0,300).perform();
		}
		for (int i = 0; i<3; i++) {
			act.scrollByAmount(0,-300).perform();
		}
	}

}
