package arrays;

import java.util.Arrays;

public class HighestNumbers {

	public static void main(String[] args) {
		
		
		// Approach 1

		int arr[]= {9,5,3,6,18,1};

		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= arr.length - 3; i--) {
			System.out.print(arr[i]+" ");
		}

		// Approach 2

		/*
		int arr[]= {9,5,3,6,18,1};
		int count=0;
		for (int i = 0; i < arr.length; i++ )
		{

			for (int j = i+1 ; j > i ; j--)
			{
				count++;
				if((arr[i]>arr[j]))
				{

					System.out.println(arr[i]);
				}
				else
				{

					System.out.println(arr[j]);
				}
			}
			i++;
		}
		System.out.println("count :"+ count);

		 */

	}

}
