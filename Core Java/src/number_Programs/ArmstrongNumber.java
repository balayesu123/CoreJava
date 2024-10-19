package number_Programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		//Armstrong number is the sum of cube of individual numbers
		
				int n = 153 , temp=n;
				int res = 0, rem;
				
				while(n > 0) {
					
					rem = n%10;
					res = res + (rem*rem*rem);
					n=n/10;
				}
				if(res == temp)
				{
					System.out.println(temp +": Armstrong Number");
				}
				else {
					System.out.println(temp +": Not a Armstrong Number");
				}
	}

}
