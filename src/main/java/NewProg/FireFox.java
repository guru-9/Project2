package NewProg;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFox {
	
	public static void fireFox()
	{
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("https://is.rediff.com/signup/register");
//		File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
//		
//		
//		File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot/photo8.jpeg");
   
       
       
		
	}

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(2000);
		driver.close();

	}

}
