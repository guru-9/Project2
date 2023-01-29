package Window;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandle {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		
		Thread.sleep(2000);
       String main= driver.getWindowHandle();		
	    driver.findElement(By.xpath("//a[text()='Twitter']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='LinkedIn']")).click();
	    Thread.sleep(2000);
		Set<String> winId = driver.getWindowHandles();
		List<String> hlist = new ArrayList<String>(winId);
		
		if (switchToWindow("Twitter", hlist))
		{
			System.out.println(driver.getCurrentUrl());
		}
		Thread.sleep(2000);
		switchToMain(main);
		System.out.println(driver.getCurrentUrl()+ " /n" +driver.getTitle() );
		Thread.sleep(2000);
		switchToWindow("Facebook", hlist);
		
		closeAllWindow(main, hlist);
		//Iterator<String> it = winId.iterator();
		
//		String par = it.next();
//		String chi = it.next();
//		System.out.println(par);
//		System.out.println(chi);
//		
//		driver.switchTo().window(par);
//		System.out.println(driver.getTitle());
	}
	
	public static void switchToMain(String main)
	{
		driver.switchTo().window(main);
	}

	
	public static void closeAllWindow(String main , List<String> hlist)
	{
		 for(String e : hlist)
		 {
			  if(!e.equals(main))
			  {
				  driver.switchTo().window(e).close();
			  }
		 }
	}
//	public static boolean switchToWindow ( String WindowTitle ,List<String> hlist )
//	{
//		for (String e : hlist)
//		{
//			String title = driver.switchTo().window(e).getTitle();
//			
//			if(title.contains(WindowTitle))
//			{
//				System.out.println("Found Right Window"  +title);
//				return true;
//			}
//			
//		}
//		return false;
//	}

	public static boolean switchToWindow(String main , List<String> hlist)
	{
		for(String e : hlist)
		{
			String title = driver.switchTo().window(e).getTitle();
			if(title.contains(main))
			{
				System.out.println("Found Right Window");
				return true;
			}
		}
		return false;
	}
	
}

