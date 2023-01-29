package NewProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\src\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    
  driver.get("https://is.rediff.com/signup/register");
  Thread.sleep(2000);
    
  driver.findElement(By.tagName("input")).sendKeys("Gururaj Khot");
  Thread.sleep(2000);
  
  driver.findElement(By.id("emailid")).sendKeys("gururaj.khot123@gmail.com");
  Thread.sleep(2000);
  
  driver.findElement(By.id("pass")).sendKeys("Admin@123");
  Thread.sleep(2000);
  
  driver.findElement(By.id("repass")).sendKeys("Admin@123");
  Thread.sleep(2000);
  
  driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[1]/form/div[14]/input[1]")).click();
  Thread.sleep(2000);
  
  driver.findElement(By.name("date_day")).sendKeys("11");
  Thread.sleep(2000);
  
  driver.findElement(By.id("date_mon")).sendKeys("JAN");
   Thread.sleep(2000);
   
 driver.findElement(By.name("Date_Year")).sendKeys("2000");
 Thread.sleep(2000);
 
 driver.findElement(By.id("signup_city")).sendKeys("Kolhapur");
 Thread.sleep(2000);
 
driver.findElement(By.id("school")).sendKeys("SHKB Gargoti");
Thread.sleep(2000);

driver.findElement(By.id("college")).sendKeys("New College Kolhapur");
  Thread.sleep(2000);
  
  

	}

	
}
