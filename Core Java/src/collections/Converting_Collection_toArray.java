package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Converting_Collection_toArray {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("bala");
		al.add(2);
		al.add('c');
		Iterator itr=al.iterator();
		Object nx = itr.next();
		boolean hsx = itr.hasNext();
		System.out.println(al);
		
		// converting collection to array
		
		Object[] obj = al.toArray();
		// System.out.println(obj);   // [Ljava.lang.Object;@1175e2db
		for(Object o : obj)
		{
			System.out.print(o+" ");
		}

	}

}
