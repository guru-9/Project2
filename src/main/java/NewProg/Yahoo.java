package NewProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Yahoo {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/account/create");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id=\"usernamereg-fullname\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"usernamereg-firstName\"]")).sendKeys("Gururaj");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"usernamereg-lastName\"]")).sendKeys("Khot");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"userId\"]")).sendKeys("guruk2311");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Guru@1106");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"usernamereg-birthYear\"]")).sendKeys("2000");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id=\"reg-submit-button\"]")).click();
		
		

	}

}
