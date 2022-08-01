package collections;

import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue();
		
		
		pq.add(40);
		pq.add(30);
		pq.add(50);
		pq.add(10);
	//	pq.add(null); // null won't allowed NullPointerException
	//	pq.add("a");  //won't allow Heterogeneous data throw ClassCastException
		
		System.out.println(pq);
	}

}
