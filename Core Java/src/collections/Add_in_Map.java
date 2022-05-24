package collections;

import java.util.HashMap;

public class Add_in_Map {
  public static void main(String[] args) {
	HashMap hm = new HashMap();
	hm.put(101,"bala");
	hm.put(102,"yesu");
	hm.put(103,"sunil");
	hm.put(104,"kumar");

	System.out.println(hm);
	System.out.println(hm.get(101));
	System.out.println(hm.keySet());
	System.out.println(hm.values());
	System.out.println(hm.entrySet());

	
}
}
