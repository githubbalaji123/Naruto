package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class up {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();

	        // Open ilovepdf website
	        driver.get("https://www.ilovepdf.com/word_to_pdf");

	        // Locate the file input element
	        WebElement fileInput = driver.findElement(By.id("pickfiles"));
	        fileInput.click();
	        // Provide the path to the file you want to upload
	        String filePath = "D:\\sn\\I am sharing 'GenericLibraries_new_5_2022' with you.docx";
	        fileInput.sendKeys(filePath);

	        // Wait for some time (you may need to wait for upload to complete)

	        // Optionally, you can find and click on the conversion button
	        


	}

}
