package homework;

public class captchHandling {

	public static void main(String[] args) {
		ChromeOptions option new ChromeOptions();
		option.addArguments("--disable-notifications"); WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[.= LOGIN ']")).click();
		Thread.sleep(4000);
		WebElement captcha = driver.findElement(By.xpath("//img[@class='captcha-img']"));
		File sro captcha.getScreenshotAs (OutputType.FILE);
		FileHandler.copy(src, new File(path
		String path="C:\\Users\\Sanjay Babu\\eclipse-workspace\\demo1\\screenShots\\captchaImg.png"; ));
		ITesseract tess = new Tesseract();
		tess.setDatapath("C:\\Users\\SanjayBabu\\Desktop\\Tess43\\tessdata");
		String text tess.doOCR(new File(path));
		System.out.println(text);
		driver.findElement(By.xpath("//input[@id='captcha']")).sendKeys(text);
	}
}
