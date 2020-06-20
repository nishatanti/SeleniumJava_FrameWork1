package Utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		//String projectPath = System.getProperty("user.dir");
		
      
		//ExcelUtils excel = new ExcelUtils(projectPath+"/Excel/Data.xlsx", "sheet1");
		String projDir = System.getProperty("user.dir");
		String excelPath = projDir + "./Excel/Data.xlsx";
		String sheetName = "Sheet1";

		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		
		
		excel.getRowCount();
		excel.getCellData(0,0);
		
		excel.getCellData(0,1);
		excel.getCellData(1,0);
		excel.getCellData(1,1);
		
		excel.getCellData(2,0);
		excel.getCellData(2,1);
		//excel.getColumnCount();
	}

}
