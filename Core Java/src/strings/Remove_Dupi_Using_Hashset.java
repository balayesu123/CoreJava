package strings;

import java.util.HashSet;

public class Remove_Dupi_Using_Hashset {

	public static void main(String[] args) {

		String s1="bala yesu";
		String s2=s1.replaceAll(" ", "");
		String str="";
		
		HashSet<Character> hs=new HashSet<Character>();

		for (int i = 0; i < s2.length(); i++) 
		{
			hs.add(s2.charAt(i));
		}
		System.out.print(hs);  //  [a, b, s, e, u, y, l]

		for(char ch : hs)
		{
		 // System.out.print(ch); // abseuyl
			str=str+ch;
		}
		System.out.print(str);   // abseuyl


	}

}
