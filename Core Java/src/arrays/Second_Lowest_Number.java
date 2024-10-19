package arrays;

import java.util.Arrays;

public class Second_Lowest_Number {

	public static void main(String[] args) {
		
		int a[]= {100,88,99,77,66};

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			// System.out.print(a[i]+" ");//Asendin order
		}
		System.out.println(a[1]);

		
		// Approach2;
		
//		int arr2[] = {44,66,99,77,33,22,55}; 	
//		Arrays.sort(arr2);
//		System.out.println(arr2[1]);

	}

}
