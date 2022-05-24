package arrays;

public class Unique_ele_with_Flag {


	public static int uniquefinder(int a[])
	{
		for (int i = 0; i < a.length; i++) 
		{
			boolean flag =false; 

			for (int j = 0; j < a.length; j++)
			{
				if(i==j)  // 0==2
				{
					continue;   // condition is true skip the current iteration
				}
				if(a[i] == a[j]) // 2==1
			
					flag = true;

				
				
			}
			if(!flag) // means (flag==false)
				return a[i];
		}
		return -1;
	}
	public static void main(String[] args) {

		int a[] = {1,1,2,2,4};
		System.out.println(uniquefinder(a)+" ");
	}

}
