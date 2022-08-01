package collections;

import java.util.HashMap;

public class Add_in_Map {
  public static void main(String[] args) {
	HashMap hm = new HashMap();
	hm.put(101,"bala");
	hm.put(102,"yesu");
	hm.put(103,"sunil");
	hm.put(104,"kumar");

	System.out.println(hm);          // {101=bala, 102=yesu, 103=sunil, 104=kumar}
	System.out.println(hm.get(101));  // bala
	System.out.println(hm.keySet());  // [101, 102, 103, 104]
	System.out.println(hm.values());  // [bala, yesu, sunil, kumar]
	System.out.println(hm.entrySet());  // [101=bala, 102=yesu, 103=sunil, 104=kumar]

	
}
}
