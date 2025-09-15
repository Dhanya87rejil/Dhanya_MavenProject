package assignments;


import java.util.List;
import java.util.Map;

public class Assignment19_ReadExcel {

	public static void main(String[] args) {
		List<Map<String, String>> excelData = ExcelUtil.readExcelData("Assignment 19.xlsx", "ProductDetails");
		System.out.println(excelData.get(1).get("Supplier"));

	}
}