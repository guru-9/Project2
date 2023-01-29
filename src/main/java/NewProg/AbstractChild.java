package NewProg;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractChild extends AbstractParent {
	
	private WebDriver driver;
	
	public void setup1() throws Exception
	{
		WebDriverManager.firefoxdriver().setup();
	     driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void setup2()
	{
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	

	public static void main(String[] args) throws Exception {
		
		AbstractParent a = new AbstractChild();
		a.screenshot();
	AbstractParent a1 = new AbstractChild();
    	a1.rediffExcel();
	}

	@Override
	public void screenshot() throws Exception {
		setup1();
		driver.get("https://www.youtube.com");
		Thread.sleep(5000);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\RealMadrid\\ScreenShots/youtube3.jpeg");
	    
		FileHandler.copy(source, dest);
		driver.quit();
		  System.out.println("ScreenShot Captured Successfully");
		
	}

	@Override
	public void rediffExcel() throws Exception {
		setup2();
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(5000);
		
	WebElement fullNameTxt =driver.findElement(By.xpath("//input[@id='fullname']"));
	
	FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\TestData\\Rediff.xlsx");
	
    Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
    
    fullNameTxt.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
  
    
//    WebElement fullNameTxt1 =driver.findElement(By.xpath("//input[@id='fullname']"));
//	FileInputStream file1=new FileInputStream("");
//	Sheet excel1= WorkbookFactory.create(file).getSheet("");
//	fullNameTxt1.sendKeys(excel1.getRow(1).getCell(2).getStringCellValue());
	
    
	}
	
	
}
