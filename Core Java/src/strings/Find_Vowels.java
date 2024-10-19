package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.regex.*;
public class Find_Vowels {

	public static void main(String[] args) {
		
		/*
		String s ="baliyesujhbaoa";
//		boolean b3 = Pattern.matches("(.[aeiou])",s ); 
//	     System.out.println(b3);
		Pattern p=Pattern.compile("([aeoiuAEIOU])");
		Matcher m = p.matcher(s);
		while(m.find())
		{
			String vowel=m.group();
			System.out.print(vowel+" ");
			
		}
		
		*/
		
		
		
		// approach 2
		
		   String str = "HEllo World";
	   	   
		   String s = "aeiou";	   		   
		   String vowels = "";
		   int count = 0;
		   
		   for(int i=0 ; i< str.length() ; i++)
		   {
		       if(s.contains(String.valueOf(str.charAt(i)).toLowerCase()))
		       {
		           vowels += str.charAt(i);
		           count++;
		       }
		   }
		    
			System.out.println(vowels + " = " + count);
		
		
		
		
	}

}
