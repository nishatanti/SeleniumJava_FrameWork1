package Utils;

public class ExcelDataProvider {
	public static void main(String[] args) {

		String projDir = System.getProperty("user.dir");
		String excelPath = projDir + "./Excel/Data.xlsx";
		String sheetName = "Sheet1";

		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		excel.getRowCount();
		excel.getCellData(1,0);
		excel.getCellData(1,1);
		excel.getCellData(1,2);
		excel.getCellData(1,3);
	}

}
