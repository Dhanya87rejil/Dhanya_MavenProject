package assignments;

public class Assignment11_diamondShape {

	public static void main(String[] args) {
		
		int n=5;

		//upper half of the diamond shape
		for(int i=1; i<=n;i++)
		{
			//Print leading spaces
			
			for( int j = 1; j<=n-i;j++)
			{
				System.out.print(" ");
			}
		
			//Print numbers

			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		

		//lower half of the diamond shape
		for (int i =n-1;i>=1;i--)
		{
			//Print leading spaces
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
		
			//Print numbers
			
			for(int k=1;k<=i;k++)
			 {
				System.out.print(k+" ");
		     }
			System.out.println();
	}

	}
}

