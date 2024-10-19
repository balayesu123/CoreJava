package number_Programs;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		// In fibonacci series each number is the sum of the two preceding numbers.
		
				int n = 10; // Number of Fibonacci numbers to generate
				
				int n1 = 0, n2 = 1;
				
				System.out.print("First " + n + " Fibonacci numbers: ");
				
				for(int i=1 ; i<=n ; i++)
				{
					System.out.print(n1+" ");
					
					//swapping of two numbers
					
					int sum = n1+n2;
					n1 = n2;
					n2 = sum;
					
				}

	}

}
