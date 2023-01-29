package NewProg;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en");
		File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot/photo10.jpeg");
        
         FileHandler.copy(source, dest);
        
           
        driver.quit();
        
	}

}
