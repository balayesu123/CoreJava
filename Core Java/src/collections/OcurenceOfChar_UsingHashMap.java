package collections;

import java.util.HashMap;

public class OcurenceOfChar_UsingHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(101, "abac");
		
		 String key = hm.get(101);

		for (int i = 0; i < key.length()  ; i++)
		{
			  
			for (int j = i+1; j < key.length(); j++)
			{
				if(key.charAt(i)==key.charAt(j))
				{
					System.out.println(key.charAt(i));
				}
			}
		}
	}

}
