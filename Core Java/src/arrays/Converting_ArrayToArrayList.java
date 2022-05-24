package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Converting_ArrayToArrayList {

	public static void main(String[] args) {
		
		// converting Array to Array list
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("abc","java","abc"));
        System.out.println(al);
        
        // lambda Expression
        al.forEach(x -> System.out.println(x));
	}

}
