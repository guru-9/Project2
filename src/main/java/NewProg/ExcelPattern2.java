package NewProg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelPattern2 {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\TestData\\Rediff.xlsx");
		   Sheet excel = WorkbookFactory.create(file).getSheet("Sheet3");
		  
		   for(int row=0;row<excel.getLastRowNum()+1;row ++)
		   {
			   for(int col=0;col<excel.getRow(row).getLastCellNum(); col ++)
			   {
				   String value = excel.getRow(row).getCell(col).getStringCellValue();
				   System.out.print(value + "\t");
				   

			   }
			   System.out.println("");
		   }
		   
	}

}
