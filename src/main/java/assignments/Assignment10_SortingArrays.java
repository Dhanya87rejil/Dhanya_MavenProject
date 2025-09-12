package assignments;

public class Assignment10_SortingArrays {

	public static void main(String[] args) {
	
		int [] values = new int[7];
		values[0]= 12;
		values[1]= 34;
		values[2]= 11;
		values[3]= 36;
		values[4]= 87;
		values[5]= 98;
		values[6]= 93;
		int n = values.length;
	
		for(int i=0; i<n-1; i++)
		{
			
				for(int j=0;j<n-1;j++)
				{
					if (values[j] > values[j+1]) {
						int temp = values[j];
						values[j] = values[j+1];
						values[j+1] = temp ;
				
					
				}
					
			}
		}	
		System.out.println("The array is arranged in ascending order as following:" );
		for (int sort: values)
		{

		System.out.println(sort);
		}
	System.out.println("The second largest value is:" +values[n-2]);
	System.out.println("The second third value is:" +values[n-3]);
		}
	}

