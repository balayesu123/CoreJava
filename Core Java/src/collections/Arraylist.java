package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		
		al.add('A');
		al.add("Balayesu");
		al.add(50000);
		al.add(false);
		al.add(null);
		al.add(29.5);
		al.add("Balayesu");
		al.add(null);
		
		System.out.println(al);    // [A, Balayesu, 50000, false, null, 29.5, Balayesu, null]                    
		System.out.println(al.size());  //  8
		al.add("Prasad");
		System.out.println(al);  // [A, Balayesu, 50000, false, null, 29.5, Balayesu, null, Prasad] 
		System.out.println(al.size());  // 9
		al.add(2,"Akula");
		System.out.println(al);  //  [A, Balayesu, Akula, 50000, false, null, 29.5, Balayesu, null, Prasad]
		System.out.println(al.size());  // 10
		System.out.println(al.isEmpty());  // false
		System.out.println(al.contains("Balayesu"));  // true
		System.out.println(al.remove(5));  //  null
		System.out.println(al);  // [A, Balayesu, Akula, 50000, false, 29.5, Balayesu, null, Prasad]
		System.out.println(al.size());  // 9
		System.out.println(al.get(2));  //  Akula
		System.out.println(al.set(6, "Kumar"));  // Balayesu
		System.out.println(al); //  [A, Balayesu, Akula, 50000, false, 29.5, Kumar, null, Prasad]
		System.out.println(al.size());  //  9

		
		for (int i = 0; i < al.size(); i++) {
			
			System.out.print(al.get(i) + " ");  //  A Balayesu Akula 50000 false 29.5 Kumar null Prasad
			
		}
		
		System.out.println();
		
		for (Object ele : al) {
			
			System.out.print(ele + " ");  //  A Balayesu Akula 50000 false 29.5 Kumar null Prasad
			
		}
		
		System.out.println();
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.print(obj + " ");  //  A Balayesu Akula 50000 false 29.5 Kumar null Prasad
		}
		
		System.out.println();
		
		
		al.clear();
		System.out.println(al);  // []

	}

}
