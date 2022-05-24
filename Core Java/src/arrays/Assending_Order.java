package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Assending_Order {

	public static void main(String[] args) {

		int arr[]= {4,2,5,3,1};

		for (int i = 0; i < arr.length; i++) 
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i] +" ");
		}
		
		// System.out.println(Arrays.toString(a));

				//*********************************************

		//		int a[]= {4,2,5,3,1};
		//		
		//		Arrays.sort(a);
		//		System.out.println(Arrays.toString(a));
		
		//		System.out.println(a);  //  it will print the address of the Array object



	}

}
