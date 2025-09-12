package assignments;

public class Assignment5_Array {

	public static void main(String[] args) {
		// Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
		
		int [] numbers = new int [10];
		numbers[0] = 87;
		numbers[1] = 96;
		numbers[2] = 78;
		numbers[3] = 82;
		numbers[4] = 84;
		numbers[5] = 90;
		numbers[6] = 78;
		numbers[7] = 94;
		numbers[8] = 99;
		numbers[9] = 100;
		
		float average2num;
		average2num = (numbers[4] + numbers[5])/2;
		System.out.println("The 5th Value is:" +numbers[4]);
		System.out.println("The 6th Value is:" +numbers[5]);
		System.out.println("The Average of 5th and 6th Value is:" +average2num);
	}

}
