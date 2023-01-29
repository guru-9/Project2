package NewProg;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TripoDeal {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tripodeal.com/");
		Thread.sleep(2000);
		WebElement dateDrop1 = driver.findElement(By.xpath("//input[@id='dateNew']"));
		dateDrop1.click();
		WebElement dateDrop2 =driver.findElement(By.xpath("//div[@id='dateNew_1671042600000']"));
		Thread.sleep(2000);
  	     Actions a = new Actions(driver);
  	   Thread.sleep(2000);

  	     a.moveToElement(dateDrop2).build().perform();
  	   Thread.sleep(2000);
  	     a.sendKeys(Keys.ARROW_RIGHT).build().perform();
  	   Thread.sleep(5000);
  	   a.sendKeys(Keys.ARROW_RIGHT).doubleClick().build().perform();
//		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		System.out.println(source);
		
//		driver.findElement(By.xpath("//input[@value=\"17/11/2022\"]")).sendKeys("18/11/2022");
     	Thread.sleep(5000);
     
     	System.out.println("Operation Complete");
     	

	}

}
