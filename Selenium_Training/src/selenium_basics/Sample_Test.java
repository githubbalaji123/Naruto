package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      // Launch the Chrome Browser
		// Create an object of Chromedriver
		
		WebDriver driver=new ChromeDriver();
		
		//Navigate to Url
		
		driver.get("https://www.google.co.in");
		
		//getTitle mtd is for returning a String that give the title of the webpage
		String title= driver.getTitle();
		System.out.println(title);
		
		//getCurrentUrl() is abstract mtd is to give the current url in String
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		// getPagesource() is to get the source of the Web page 
		
		//String pgsrc=driver.getPageSource();
		//System.out.println(pgsrc);
		
		
		// navigate() will give do the method chaining concepts by using "." will another method to navigate to a url
		
		driver.navigate().to("https://www.amazon.in/");
		
		// to maximise the window 
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().back(); // this will help to come back to previous page
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
				
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		// quit() will also close the both parent and child windows
				driver.quit();
		
		//close() it to close only the parent browser
		
		//driver.close();
		
		 
	}

}
