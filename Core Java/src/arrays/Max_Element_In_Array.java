package arrays;

public class Max_Element_In_Array {

	public static void main(String[] args) {

		int a[] = {200,800,140,500,};

		int max =a[0];
       
		for (int i = 1; i < a.length; i++) 
		{
			if(a[i] > max )
			{
				max=a[i];
				
			}
		}
		System.out.println(max);
	}

}
