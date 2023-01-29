package Window;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSugestion {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("seleni");
 Thread.sleep(2000);
 List<WebElement> autoSug = driver.findElements(By.xpath("//ul[@role=\"listbox\"]"));
 
 for(int i=0;i<autoSug.size();i++)
 {
	 System.out.println(autoSug.get(i).getText());
 }
 
 for(int i=0;i<autoSug.size();i++)
 {
	 if(autoSug.get(i).getText().equals("Selenium Webdriver"))
	 {
		 autoSug.get(i).click();
		 break;
	 }
 }
 

 }

}
