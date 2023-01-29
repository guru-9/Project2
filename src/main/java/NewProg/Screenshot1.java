package NewProg;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot1 {

	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\DELL\\eclipse-workspace\\Selenium\\src\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.decathlon.in/");
		
//		WebElement dLogo = driver.findElement(By.xpath("//img[@class='w-[100px] lg:w-36 border border-white cursor-pointer']"));
//		File source = dLogo.getScreenshotAs(OutputType.FILE);
//		  File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot/photo9.jpeg");
//	        
//	         FileHandler.copy(source, dest);
	        driver.close();
		
		
		
	}

}
