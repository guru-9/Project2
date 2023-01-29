package NewProg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelPattern1 {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\TestData\\Rediff.xlsx");
	    Sheet excel = WorkbookFactory.create(file).getSheet("Sheet2");
	    
	    for(int row=0;row<4;row++)
	    {
	    	for(int col=0; col <5;col++)
	    	{
	    		String value = excel.getRow(row).getCell(col).getStringCellValue();
	    		System.out.print(value + "\t");
	    	}
	    	System.out.println("");
	    }
//           String value = excel.getRow(0).getCell(0).getStringCellValue();
////           System.out.println(value);
	}

}
