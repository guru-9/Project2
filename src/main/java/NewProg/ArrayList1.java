package NewProg;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArrayList1 {

	public static void main(String[] args) {
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//
//		for(int i =0; i<=10;i++)
//		{
//			
//			
//				arr.add(i*2);
//			
//		}
//		System.out.println(arr);
		
//		ArrayList<Integer> arr1 = new ArrayList<Integer>();
///	arr.remove(5);
//		System.out.println(arr);
//		System.out.println(arr.contains(6));
//		
//	Collections.sort(arr);
//	System.out.println(arr);
//	
//	Collections.shuffle(arr);
//	System.out.println(arr);
		
	
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(500);
		hs.add(600);


		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	
	

	
//		HashSet<Integer> hs1 = new HashSet<Integer>();
//		hs1.addAll(hs);
//		System.out.println(hs1);
//		
//		Collections.sort(hs);
		
		
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.navigate().to("https://www.decathlon.in");
//		
//		
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\RealMadrid\\ScreenShots/photo2.jpeg");
//		
	
		
		
	}
}
