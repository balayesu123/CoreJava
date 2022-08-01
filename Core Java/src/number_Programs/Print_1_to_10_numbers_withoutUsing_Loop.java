package number_Programs;

public class Print_1_to_10_numbers_withoutUsing_Loop {
	
	public static void number(int num)
	{
		if(num <= 10)
		{
			System.out.print(num+" ");
			number(num+1);
		}
			
	}

	public static void main(String[] args) {
		int n=1;
		number(n);
	}

}
