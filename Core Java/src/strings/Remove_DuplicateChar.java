package strings;

public class Remove_DuplicateChar {
	public static void main(String[] args) {

		String str = "MADAMMADAM";	
		String rmvDup = "";

		for(int i=0 ; i<str.length() ; i++)
		{
			char ch = str.charAt(i);
			int index = rmvDup.indexOf(ch);

			if(index == -1)
			{
				rmvDup = rmvDup+ch;
			}

		}
		System.out.println(rmvDup);

		//**********2nd Approach ************

		/*	String s1="abcd ab cd";

		String s2 = s1.replaceAll(" ", "");

		char ch[]=s2.toCharArray();

		for(int i=0 ; i < ch.length ; i++)
		{
			for(int j=i+1 ; j<ch.length ; j++)
			{ 
				if(ch[i]==ch[j])
				{
					ch[j]='0'; 
				}
			}

			if(ch[i]!='0')
			{
				System.out.print(ch[i]);
			}	
		}       */

		//**********3rd Approach ************

	/*		String s1="abcdab";

		for(int i=0 ; i < s1.length() ; i++)
		{
			int count=1;
			for(int j=i+1 ; j<s1.length() ; j++)
			{ 
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;			
			    }
			}

			if(count==1)
			{
				System.out.print(s1.charAt(i)); // it will remove duplicates of first half
			}
		}  */

		//**********4th Approach Remove duplicates equalsIgnoreCase ************

	/*	String ip="abcdABadCD";
		char ch[] = ip.toCharArray(); 
		for (int i = 0; i < ch.length; i++) {

			String str1 = String.valueOf(ch[i]);

			for (int j = i+1; j < ch.length; j++) {

				String str2 = String.valueOf(ch[j]);

				if(str1.equalsIgnoreCase(str2))
				{
					ch[j]='0';
				}
			}
			if(ch[i]!='0')
			{
				System.out.print(ch[i]);
			}
		}  */
	}	
}
