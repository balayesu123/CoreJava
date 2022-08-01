package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Max_element_Using_Collection {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,90,30,50);
		
		Integer max = Collections.max(list);
		
		System.out.println(max);
		
		//*********** 2nd Approach **********
		
		List<String> str = Arrays.asList("A","B","C","D");
		
        String maxstr = Collections.max(str);
		
		System.out.println(maxstr);
	}

}
