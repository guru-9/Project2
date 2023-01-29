package NewProg;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\src\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://is.rediff.com/signup/register");
			Thread.sleep(2000);
		      Dimension d = new Dimension(500,600);
		      driver.manage().window().setSize(d);
		      

	}

}
