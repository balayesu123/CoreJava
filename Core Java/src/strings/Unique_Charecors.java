
package strings;

public class Unique_Charecors {

	public static void main(String[] args) {
		
		String s1="abcabd";

		for(int i=0 ; i < s1.length() ; i++)
		{
			int count=0;
			for(int j=0 ; j<s1.length() ; j++)
			{ 
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;			
			    }
			}

			if(count==1)
			{
				System.out.print(s1.charAt(i));
			}
		}  

	}

}
