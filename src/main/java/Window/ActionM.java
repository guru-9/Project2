package Window;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionM {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 Thread.sleep(2000);
		driver.manage().window().maximize();
//		driver.get("https://www.globalsqa.com/demo-site/draganddrop");
//		 Thread.sleep(2000);
//		WebElement img1 = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
//		 Thread.sleep(2000);
//		WebElement trash = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
//		 Thread.sleep(2000);
//		Actions act = new Actions(driver);
//        Thread.sleep(2000);
//         act.dragAndDrop(img1, trash).build().perform();
// 
		
		String URL = "https://demoqa.com/droppable/";
		 
		driver.get(URL);
		Thread.sleep(2000);
		// It is always advisable to Maximize the window before performing DragNDrop action		 
		driver.manage().window().maximize();
		 
//		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		//Actions class method to drag and drop		
		Actions builder = new Actions(driver);
		Thread.sleep(2000);
		WebElement from = driver.findElement(By.id("draggable"));
		 
		WebElement to = driver.findElement(By.id("droppable"));	 
		//Perform drag and drop
		Thread.sleep(2000);
		builder.clickAndHold(from);
		builder.dragAndDrop(from, to).perform();
	}

}
