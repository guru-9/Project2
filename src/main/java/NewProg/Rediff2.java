package NewProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff2 {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(2000);
	
		
		WebElement newLable1 = driver.findElement(By.xpath("//b[text()='New User? Register here']"));
		WebElement newLable2 = driver.findElement(By.xpath("//p[@class = 'grey1']"));
		
		System.out.println(newLable1.getText());
		System.out.println(newLable2.getText());
	
	}

}
