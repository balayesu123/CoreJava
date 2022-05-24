package strings;

public class OccurenseOfWord {

	public static void main(String[] args) {
		String s= "I Love my India I Love My Country";
		String str[]=s.split(" ");
            int count=0;
		for (int i = 0; i < str.length; i++) 
		{
			count++;
			for (int j = i+1; j < str.length; j++)
			{
				if(str[i].equals(str[j]))
				{
					System.out.println(str[j]);
				}

			}

		}
		System.out.println("Number of words : "+count);
	}

}
