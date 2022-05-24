package collections;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		
		LinkedList  ll = new LinkedList();
		
		ll.add("Bala");
		ll.add(25);
		ll.add(true);
		ll.add(null);
		ll.add('A');
		
		
		
		
		System.out.println(ll);  //  [Bala, 25, true, null, A]
		System.out.println(ll.size());  // 5
		ll.addFirst("Akula");
		ll.addLast("yesu");
		System.out.println(ll);  //  [Akula, Bala, 25, true, null, A, yesu]
		System.out.println(ll.size());  //  7
		System.out.println(ll.get(2));  // 25
		System.out.println(ll.getFirst()); // Akula
		System.out.println(ll.getLast());   // yesu
		
		
		ll.add(4,"yesu");  
		System.out.println(ll.get(0));  // Akula
		System.out.println(ll.set(2, 30));  // 25
		
		System.out.println(ll);  //  [Akula, Bala, 30, true, yesu, null, A, yesu]
		
		
		


	}

}
