package NewProg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffExcel {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(5000);
	WebElement fullnameTxt =	driver.findElement(By.xpath("//input[@id='fullname']"));
      WebElement emailTxt =  driver.findElement(By.xpath("//input[@id='emailid']"));
      WebElement passTxt = driver.findElement(By.xpath("//input[@id='pass']"));
      WebElement repassTxt = driver.findElement(By.xpath("//input[@id='repass']"));
      WebElement gender1Button = driver.findElement(By.xpath("//input[@value='m']"));
      WebElement gender2Button = driver.findElement(By.xpath("//input[@value='f']"));
      WebElement dateDrop = driver.findElement(By.xpath("//select[@id='date_day']")); 
//      fullnameTxt.sendKeys("Gururaj Khot");
//      emailTxt.sendKeys("xyz@gmail.com");
//	
      FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\TestData\\Rediff.xlsx");
    Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
      excel.getRow(0).getCell(0).getStringCellValue();
      excel.getRow(0).getCell(1).getStringCellValue();
//    System.out.println(Value1); put the value in String value1
      
      fullnameTxt.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
      emailTxt.sendKeys( excel.getRow(0).getCell(1).getStringCellValue());
      passTxt.sendKeys(excel.getRow(0).getCell(2).getStringCellValue());
      repassTxt.sendKeys(excel.getRow(0).getCell(3).getStringCellValue());
      gender1Button.click();
      gender2Button.click();
      dateDrop.sendKeys(excel.getRow(0).getCell(4).getStringCellValue());
      
      
      
      Thread.sleep(5000);
//      driver.close();
	}

}
