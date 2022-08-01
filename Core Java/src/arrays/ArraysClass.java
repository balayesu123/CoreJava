package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysClass {

	public static void main(String[] args) {
		
		int a[] = {4,2,7,9,8,6};
		int b[] = {4,2,7,9,8,6};
		System.out.println(Arrays.hashCode(a));
		System.out.println(Arrays.toString(a));
		List<int[]> al = Arrays.asList(a);
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		 boolean bool = Arrays.equals(a,b);
		 int hs = Arrays.hashCode(a);
		 String str = Arrays.toString(a);
		 System.out.println(str);

	}

}
