package arrays;

import java.util.Arrays;

public class Second_Highest_Number {
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
		System.out.println(a[a.length-2]);

		
		// Approach2;

//		int arr[] = {44,66,99,77,33,22,55}; 	
//		Arrays.sort(arr);
//		System.out.println(arr[arr.length-2]);
		
	
	}
}
