package number_Programs;

public class ReverseNumber {

	public static void main(String[] args) {
		
		// Reverse a number
		
				int num = 5689;
				int result = 0;
				int remainder;
				
				while(num > 0)
				{
					remainder = num%10;                   // Extracting last digit of given number
					result = (result * 10)+ remainder;    // Reverse the given number
					num = num/10;                         // Eliminating last digit of given number
				}
				
				System.out.println("Reverse a number: "+result);

	}

}
