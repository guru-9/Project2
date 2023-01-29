package NewProg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YouTube {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		WebElement search = driver.findElement(By.xpath("//body//form[@id='search-form']//div//input[@name='search_query']"));
		search.click();
		search.sendKeys("Pehli Dafa");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='video-title'][1]")).click();
        
//        driver.findElement(By.xpath("//yt-formatted-string[@class='c']")).click();
        WebElement skip = driver.findElement(By.xpath("div[@id='ad-text:6']"));
      
        if(skip.isDisplayed())
        {
        
        	skip.click();
        }
      
	}

}
