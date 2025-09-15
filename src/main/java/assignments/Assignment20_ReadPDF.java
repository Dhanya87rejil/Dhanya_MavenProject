package assignments;

public class Assignment20_ReadPDF {

	public static void main(String[] args) {

		String pageText = PdfUtil.getText("Transactions.pdf", 1, 1);

		String[] values = pageText.split(" ");
		double totalamt = 0;

		for (String val : values) {
			try {
				double amt = Double.parseDouble(val);
				totalamt = totalamt + amt;
				System.out.println("Amount found: " + amt);

			} catch (NumberFormatException e) {
			}

		}
		System.out.println("Total transaction amt is: " + totalamt);


	}

}
