package arrays;

import java.util.HashSet;

public class Remove_duplicate_Using_HashSet {

	public static void main(String[] args) {

		int a[]= {3,4,1,2,3,2,4,5,1,6};

		HashSet<Integer> hs=new HashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) 
		{
			  hs.add(a[i]);
		}
		// System.out.println(hs);  // [1, 2, 3, 4, 5, 6]
		
		for (int x : hs)
		{
			System.out.print(x +" ");  //  1 2 3 4 5 6
		}
	}

}
