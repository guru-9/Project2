package NewProg;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();     
        driver.manage().window().maximize();
        driver.get("https://is.rediff.com/signup/register");
        Thread.sleep(5000);
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot/photo58.jpeg");
        FileHandler.copy(source, dest);
//        System.out.println(source);
////        
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//		File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE); //firefoxdriver class type casted with instance of webdriver. output type define type of output for screenshot
//		//FILE obtains that screenshot in temp file //Base64//BITE
//        File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot/photo10.jpeg");
//        
//         FileHandler.copy(source, dest);
        
         
           
        driver.close();
        
	}

}
