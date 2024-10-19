package number_Programs;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 7;
		int count = 0;
		
		for(int i=1 ; i<=n ; i++)
		{		
			if(n%i == 0)
			{
				count++;
			}
		}
		if(count==2) {
			System.out.println("given number is prime number");
		
		}
		else
		{
			System.err.println("given number is not a prime number");
			
		}

	}

}
