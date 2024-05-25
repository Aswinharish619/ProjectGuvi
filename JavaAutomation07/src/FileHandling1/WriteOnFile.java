package FileHandling1;

import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteOnFile {

	public static void main(String[] args) {

		XSSFWorkbook wb = new XSSFWorkbook();

		XSSFSheet sh = wb.createSheet("EmployeeData");

		ArrayList<Object[]> empData = new ArrayList<>();
		empData.add(new Object[] { "EmpId", "Name", "Designation" });
		empData.add(new Object[] { 101, "Peter", "Automation Engineer" });
		empData.add(new Object[] { 102, "Ray", "Manager" });
		
		int rownum=0;
		
		//outer loop for -Rows
		
		for (Object[] emp : empData) {
			
			//outer loop for rows
			XSSFRow row = sh.createRow(rownum++);
			int cellnum =0;
			
		for (Object value : emp) {
			
			XSSFCell cell = row.createCell(cellnum++);
			
			if(value instanceof String)
				cell.setCellValue((String) value );
			if(value instanceof Integer )
				cell.setCellValue((Integer) value);
			if(value instanceof Boolean)
				cell.setCellValue((Boolean) value);
			
		}	
		}
		
		//Give file path where exmployes.xlse will create
		//String filepath = ".
		
		
	}

}
