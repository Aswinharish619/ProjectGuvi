package FileHandling1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandle1 {

	public static void main(String[] args) throws IOException {
		
		// Specify the location
		File Src= new File("C:\\Users\\haris\\OneDrive\\Documents\\JAVA AUTOMATION TESTING\\Java Basics\\\\File Read\\Demo.xlsx");
		
		//Load File
		FileInputStream fis = new FileInputStream(Src);
		
		//Load Workbook
		@SuppressWarnings("resource")
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		//Load Sheet
		XSSFSheet sh= wb.getSheet("DemoSheet");
		
		//Print sheet name
		System.out.println(sh.getSheetName());
		
		//Print Excel cell Values
		System.out.print(sh.getRow(0).getCell(0).getStringCellValue()+" ");
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		
		//Print P3 value of cell
		System.out.println(sh.getRow(3).getCell(1).getStringCellValue());
		
		//print total number of Rows
		System.out.println(sh.getPhysicalNumberOfRows());
	
		//print total number of columns 
		System.out.println(sh.getRow(0).getPhysicalNumberOfCells());
		
		int rows= (sh.getLastRowNum()+1);
		System.out.println(rows);
		int columns =(sh.getRow(0).getLastCellNum());
		System.out.println(columns);
		
		//print all Cells of Excel sheet
		
	//	for (int i=0; )
		
		
		
		
		
		
		
		
		

	}

}
