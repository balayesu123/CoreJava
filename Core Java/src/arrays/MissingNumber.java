package arrays;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {

		int a[] = {2,8,6,4};
		
		Arrays.sort(a);  // it makes given array in Ascending order a[] = {2,4,6,8}

		System.out.println("Missing Numbers :");
		
		for(int i=0 ; i<a.length-1 ; i++)
		{
			for(int j=a[i]+1 ; j<a[i+1] ; j++)
			{
				System.out.print(j+" ");
			}	
		}
	}

}


