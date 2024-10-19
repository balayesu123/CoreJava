package number_Programs;

public class Palindrome {

	public static void main(String[] args) {
		
		// A palindrome is a number (or a sequence) that reads the same backward as forward. 
		
		int num = 121;
		int temp = num;
		int result = 0;
		int remmaider ;
		
		while(num > 0) 
		{
			remmaider = num%10;                  // This extracts the last digit of num. For instance, if num is 121, remainder becomes 1.
			result = (result * 10) + remmaider;  // This line builds the reversed number step by step.
			num = num/10 ;                       // This removes the last digit from num by performing an integer division by 10. For instance, if num was 121, it now becomes 12.
			
		}
		if(temp == result)
		{
			System.out.println(result + " Is a palindrome");
		}
		else
		{
			System.out.println(result + " Is not a palindrome");
		}

	}

}
