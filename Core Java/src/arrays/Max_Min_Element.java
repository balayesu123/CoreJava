package arrays;

public class Max_Min_Element {

	public static void main(String[] args) {
		int a[] = {5,1,8,7};

		int max =a[0];
		int min =a[0];
		for (int i = 1; i < a.length; i++) 
		{
			if(a[i] > max )
			{
				max=a[i];
				
			}
			else if(a[i] < min )
			{
				min=a[i];
				
			}
		}
		System.out.println(max +" "+min);

	}

}
