package assignments;

public class Assignment13_Prime {

	//Method to check if it is prime number
	public boolean prime(int number)
	{
		//number less than or equal to 1 is not prime
		if (number<= 1)
		{
			return false;
		}
		
		else if (number >= 2)
		{
			//Loop from 2 to input-1 to check if any number divides 'input'
			for(int i = 2; i < number;i++)
			{
				// If number is divisible by i, it's not prime and if reminder is 0 it is not prime
				if(number%i==0)
				{
					return false;
				}
				
			}
		}
		//if number is not divisible 
		return true;
		
	}
	public static void main(String[] args) {
	//input number to validate prime or not
	int number = 796;
	Assignment13_Prime obj = new Assignment13_Prime();

	System.out.println("The Number " +number +" is a Prime number: "+ obj.prime(number));
	if (obj.prime(number)== true)
	{
		System.out.println("The Number " +number +" is a Prime number");
	}
	else
		System.out.println("The Number " +number +" is not a Prime number");

	}

}
