package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Unique_elements_Using_HashSet {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("b");
		al.add("c");
		al.add(12);
		al.add(15);
		al.add(12);
		
		System.out.println(al);  // [a, b, c, d, b, c, 12, 15, 12]
		
		HashSet hs=new HashSet(al);
		
		System.out.println(hs);  // [a, b, c, d, 12, 15]


	}

}
