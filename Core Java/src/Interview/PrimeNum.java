package Interview;

public class PrimeNum {

	public static void main(String[] args) {
		
		int n = 5 ;
		int count=0;
		for(int i=1 ; i<=n ; i++)
		{
			if(n%i == 0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("given number is a prime number");
		}
		else
		{
			System.out.println("given number is not a prime number");
		}
				
	}

}
