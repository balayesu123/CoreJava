package strings;

public class Count_Duplicate_Char {

	public static void main(String[] args) {

		String s= "abcdada";
		char ch[]=s.toCharArray();

		for (int i = 0; i < ch.length; i++)
		{
			int count =1;

			for (int j = i+1; j < ch.length; j++) 
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='0';
				}	
			}
			if(ch[i]!='0' && count!=1) // if(ch[i]!='0' && count==1)  for uniue count
			{	
			  System.out.println(ch[i] + " = "+ count);	
			}
		}
	}
}
