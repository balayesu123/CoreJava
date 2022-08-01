package strings;

public class OccurenseOfWord {

	public static void main(String[] args) {
		String s= "I Love my India I Love My Country I";
		String str[]=s.split(" ");
            
		for (int i = 0; i < str.length; i++) 
		{
			int count=1;
			for (int j = i+1; j < str.length; j++)
			{
				if(str[i].equals(str[j]))
				{
					count++;
					str[j]="0";
					
				}

			}

			if(str[i]!="0" && count>1)
			{
				System.out.println(str[i]);
			}
		}
		
	}

}
