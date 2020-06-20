package Utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) {
		try{
			String projDir = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
			}
		catch(Exception e) {
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}
	}

	public static void getRowCount() {
			
		    String projDir = System.getProperty("user.dir");
		    int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows:"+ rowCount);		
	}

	public static void getColCount() {
		
		    String projDir = System.getProperty("user.dir");
			int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of columns:"+ colCount);

		
	}
	//public static String getCellDataString(int rowNum,int colNum) {
		//String cellData = null;
		//try {
			////projectPath = System.getProperty("user.dir");
			////workbook = new XSSFWorkbook(projectPath + "\\Excel\\Data.xlsx");
			////sheet = workbook.getSheet("Sheet1");
			//cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);

		//}catch(Exception e) {
			//System.out.println(e.getMessage());
			//System.out.println(e.getCause());
			//e.printStackTrace();
		//}
		//return cellData;
	public static void getCellData(int rowNum,int colNum) {
		
		DataFormatter formatter = new DataFormatter();
		Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
		System.out.println(value);
			
			
	}

	//public static void getCellDataNumber(int rowNum,int colNum) {
		//try {

			//double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(cellData);

		//}catch(Exception e) {
			//System.out.println(e.getMessage());
			//System.out.println(e.getCause());
			//e.printStackTrace();
		//}
	//}


}




