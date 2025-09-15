package Scripts;

import java.util.List;
import java.util.Map;

import utilities.ExcelUtil;

public class ExcelTest {

	public static void main(String[] args) {
		// method 1: using 2D array retrieving data from excel
		System.out.println("method 1: using 2D array retrieving data from excel");
		String[][] data = ExcelUtil.readData("TestData.xlsx", "Sheet1");
		for (int r = 0; r < data.length; r++) {
			for (int c = 0; c < data[r].length; c++) {
				System.out.println(data[r][c]);
			}
		}
		
		// method 2:using collection retrieving data from excel
		List<Map<String,String>> excelData = ExcelUtil.readExcelData("TestData.xlsx", "Sheet1");
		System.out.println("method 2:using collection retrieving data from excel");
		System.out.println(excelData.get(0).get("Username"));
		System.out.println(excelData.get(0).get("Password"));
		System.out.println(excelData.get(0).get("OTP"));
		System.out.println(excelData.get(1).get("Username"));
		System.out.println(excelData.get(1).get("Password"));
		System.out.println(excelData.get(1).get("OTP"));
		
		

	}

}