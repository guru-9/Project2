package NewProg;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
   
public class AbstractFacebookChild extends AbstractFacebookParent{
	
	private WebDriver driver;
//	public void setup1()
//	{
//		WebDriverManager.firefoxdriver().setup();
//	     driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//	}
	public void setup2()
	{
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
//  @Override
//public void screenshot() throws Exception {
//	setup1();
//	driver.get("https://www.youtube.com");
//	Thread.sleep(2000);
//	File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
//	File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot/youtube3.jpeg");
//    
//	FileHandler.copy(source, dest);
//	driver.quit();
//	  System.out.println("ScreenShot Captured Successfully");
//}
  
  
	public static void main(String[] args) throws Exception{
//		AbstractFacebookParent a = new AbstractFacebookChild();
//		a.screenshot();
		AbstractFacebookParent a1 = new AbstractFacebookChild();
     	a1.dropdown();
	}
	@Override
	public void dropdown() throws Exception {
		   setup2();
		  Thread.sleep(2000);
		  driver.get("https://www.facebook.com/");
		  Thread.sleep(2000);
		  WebElement create= driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		  Thread.sleep(2000);
		  create.click();
		  Thread.sleep(2000);
		 WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		 Thread.sleep(2000);
		 day.click();
		 Thread.sleep(2000);
		 Select a = new Select(day);
		 Thread.sleep(2000);
		 a.selectByVisibleText("9");
		 Thread.sleep(2000);
		 Actions b = new Actions(driver);
		 Thread.sleep(2000);
		 b.moveToElement(day).build().perform();
		 Thread.sleep(2000);
		 for(int i=0;i<=5;i++)
		 {
		 b.sendKeys(Keys.ARROW_UP).build().perform();
		 Thread.sleep(2000);
		 }
		driver.close();
	}
	
}
