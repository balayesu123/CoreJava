package strings;

import java.util.Arrays;

public class Practies {

	public static void main(String[] args) {
	
		String s = "java python javascript #c";
		
		String str[] = s.split(" ");
		
		String largestword="";
		
		for(String word : str)
		{
			if(word.length() < str.length)
			{
				largestword = word;
			}
		}
		System.out.println(largestword);
		
		
		
		
		
		
		
		
		
		
	}

}


