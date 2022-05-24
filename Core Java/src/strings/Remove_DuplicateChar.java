package strings;

public class Remove_DuplicateChar {
	public static void main(String[] args) {
		
		String s1="I am bala";
		
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
		}
		
		//**********2nd Approach ************
		
		/*	String s1="abcabd";

		for(int i=0 ; i < s1.length() ; i++)
		{
			int count=0;
			for(int j=i+1 ; j<s1.length() ; j++)
			{ 
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;			
			    }
			}

			if(count!=1)
			{
				System.out.print(s1.charAt(i));
			}
		}  */
	}
}
