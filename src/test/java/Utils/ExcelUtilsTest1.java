package Utils;

import java.io.IOException;

public class ExcelUtilsTest1 {

	public static void main(String[] args) throws IOException {
		
		String projDir = System.getProperty("user.dir");
		String excelPath = projDir + "./Excel/TestData.xlsx";
		String sheetName = "Sheet1";
		ExcelUtilss1 excel = new ExcelUtilss1(excelPath, sheetName);

		excel.getRowCount();
		excel.getCellData(1,0);
		excel.getCellData(1,1);
		excel.getCellData(1,2);
		excel.getCellData(1,3);
	}

}
