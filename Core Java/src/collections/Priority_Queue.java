package collections;

import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue();
		
		pq.add(10);
		pq.add(0);
		pq.add(5);
		pq.add(20);
	//	pq.add(12);  won't allow Heterogeneous data throw ClassCastException
		
		System.out.println(pq);
	}

}
