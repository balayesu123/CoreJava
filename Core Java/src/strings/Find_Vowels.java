package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
public class Find_Vowels {

	public static void main(String[] args) {
		String s ="baliyesujhbaoa";
//		boolean b3 = Pattern.matches("(.[aeiou])",s ); 
//	     System.out.println(b3);
		Pattern p=Pattern.compile("([aeoiu])");
		Matcher m = p.matcher(s);
		while(m.find())
		{
			String vowel=m.group();
			System.out.print(vowel+" ");
			
		}
		
	}

}
