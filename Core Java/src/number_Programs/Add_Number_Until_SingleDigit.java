package number_Programs;

public class Add_Number_Until_SingleDigit {

	public static void main(String[] args) {
		int n=12335, sum=0,rem;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			sum=sum+rem;
			if(n == 0 && sum > 9)
			{
				n=sum;
				sum=0;
			}
		}
		System.out.println(sum);
	}
}
