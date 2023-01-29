package NewProg;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.io.FileHandler;

public class ScreenshotPratice {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();     
        driver.manage().window().maximize();
        driver.get("https://is.rediff.com/signup/register");
        Thread.sleep(5000);
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot/photo58.jpeg");
        FileHandler.copy(source, dest);
	}

}
