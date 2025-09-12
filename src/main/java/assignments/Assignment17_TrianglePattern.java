package assignments;

public class Assignment17_TrianglePattern {
	public static void main(String[] args) {
		//Write a program to print * in triangle pattern
		int rows = 5;
		for (int i = 1;i<= rows; i++)
		{
			//print spaces
			for (int j= i;j<=rows-1;j++)
			{
				System.out.print(" ");
			}
			//print *
			for(int k=1; k<=i;k++)
			{
			
			System.out.print("*");
			}
			//move to next line
			System.out.println();
		}

	}

}
