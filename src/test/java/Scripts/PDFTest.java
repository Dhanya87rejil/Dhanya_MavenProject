package Scripts;

import utilities.PdfUtil;

public class PDFTest {
	
	public static void main(String[] args) {
		String page2Text = PdfUtil.getText("Data.pdf", 2, 2);
	
		System.out.println(page2Text);
		
	}
}
