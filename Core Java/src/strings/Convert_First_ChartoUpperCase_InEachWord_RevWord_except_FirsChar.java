package strings;

public class Convert_First_ChartoUpperCase_InEachWord_RevWord_except_FirsChar {

	public static void main(String[] args) {

		String str="bang-al&ore is cap**ital of ka*rnataka#";

		String remvSpeChar =  str.replaceAll("[^a-zA-Z\\s]","");
		System.out.println(remvSpeChar);

		String s[]=remvSpeChar.split(" ");

		for(int i=0;i<s.length;i++)
		{
			char ch=s[i].charAt(0);
			String upper=String.valueOf(ch).toUpperCase();
			String sub=s[i].substring(1);
			StringBuilder sb = new StringBuilder(sub);
			sb.reverse();
			System.out.print(upper+sb+" ");
		}

		// *************Using ForEach Loop **************

		/*	String input = "balayesu akula";
		String word[] = input.split(" ");
		System.out.println(input);
		for (String w : word) 
		{
			char firstchar = w.charAt(0);
			String upperchar = String.valueOf(firstchar).toUpperCase();
			String substr = w.substring(1);
			StringBuilder substring = new StringBuilder(substr);
			substring.reverse();
			System.out.print(upperchar+substring+" ");
		}  */
	}

}
