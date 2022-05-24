package collections;

import java.util.HashMap;

public class Treemap {

	public static void main(String[] args) {

		HashMap hs =new HashMap();

		// it dosen't follows the insertion order
		hs.put("bangaram", 50000);
		hs.put("vendi", 35000);
		hs.put("Raagi", 25000);
		hs.put("ittadi", 20000);
		hs.put("puttadi", 20000);  // it  allows the duplicate values
		hs.put("bangaram", 60000); // it dosen't allows the duplicate keys if you write it will replace with that duplicate key

		hs.put(null, null);  // it  allows the only one null key
		hs.put("diamond", null);   //  it  allows the multiple  null values

		System.out.println(hs); 
	}

}
