package Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilss1 {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;


	public ExcelUtilss1(String excelPath,String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);

		}catch(Exception e) {
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}
	}	
	public static void getCellData(int rowNum,int colNum) throws IOException {
		
		DataFormatter formatter = new DataFormatter();
		Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));

		//double value = sheet.getRow(1).getCell(2).getNumericCellValue();
		System.out.println(value);
	}

	public static void getRowCount() {

		String projDir = System.getProperty("user.dir");		
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No. of rows" +rowCount);
	}

}


