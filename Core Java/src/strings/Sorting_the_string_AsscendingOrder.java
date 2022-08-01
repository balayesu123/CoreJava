package strings;

import java.util.Arrays;

public class Sorting_the_string_AsscendingOrder {

	public static void main(String[] args) {

		String s="dcab";
		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = i+1;j < ch.length; j++) 
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]= temp;
				}

			}
			//System.out.print(ch);
		}
		System.out.println(Arrays.toString(ch));
	}
}

