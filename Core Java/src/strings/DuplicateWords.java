package strings;

public class DuplicateWords {

	public static void main(String[] args) {

		String Str="java abc java kyc bcd java kyc bcd kyc kyc bcd";

		String s[] = Str.split(" ");

		for(int i=0 ; i<s.length ; i++) 
		{
			int count = 1;

			if(s[i] != " ") 
			{
				for(int j = 1+i ; j < s.length ; j++)
				{
					
					if(s[i].equals(s[j])) 
					{
						count++;
						s[j] = " ";
					}
				}
				if(count > 1 )
				{
					System.out.println(s[i]+" = "+count);
				}
			}
		}

	}

}
