package emberson;

public class Practies {
	
	public static void main(String[] args) {
		
		String str="h3#1aaabb4678jaah7856agh656";
		String alphabet = "";
		String numbers = "";
		for(int i=0 ; i<str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(Character.isLetter(ch))
			{
				alphabet=alphabet+ch;
			}
			else
			{
				numbers=numbers+ch;
			}
		}
		System.out.println("Alphabets are :" + alphabet);
		System.out.println("Numbers are : " + numbers);

		
		
	}

}
