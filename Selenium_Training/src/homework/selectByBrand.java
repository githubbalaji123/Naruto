package homework;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectByBrand {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		String mobo=sc.nextLine();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/s?k=phones&crid=2GX5A852ABPQ4&sprefix=phones%2Caps%2C419&ref=nb_sb_noss_1");
		if (mobo.equalsIgnoreCase("Redmi")) {
			driver.findElement(By.xpath("//span[text()='Redmi']")).click();
		}else if(mobo.equalsIgnoreCase("Apple")) {
			driver.findElement(By.xpath("//span[text()='Apple']")).click();
		}else if(mobo.equalsIgnoreCase("Samsung")) {
		driver.findElement(By.xpath("//span[text()='Samsung']")).click();
	}else if(mobo.equalsIgnoreCase("realme")) {
		driver.findElement(By.xpath("//span[text()='realme']")).click();
	}else if(mobo.equalsIgnoreCase("OnePlus")) {
		driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
	}
	}
}
