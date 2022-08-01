package arrays;

import java.util.Arrays;
import java.util.Collections;

public class Dessending_Order {

	public static void main(String[] args) {

		int a[]= {1,2,5,3,4};

		for(int i=0 ; i < a.length ; i++)
		{
			for(int j=i+1 ; j < a.length ; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i] + " ");  // Desending Order
		}

		// System.out.println(Arrays.toString(a));

		//*********************************************

/*		int b[]= {4,2,5,3,1};
		Arrays.sort(b);
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.print(b[i]+" ");
		}  */

		//*********************************************
	/*	Integer c[]= {2,3,4,1,5,6}; 

		Arrays.sort(c , Collections.reverseOrder());
		System.out.println(Arrays.toString(c));

		*/
	}

}
