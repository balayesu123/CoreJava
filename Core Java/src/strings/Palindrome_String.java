package strings;

public class Palindrome_String {

	public static void main(String[] args) {
		
		String str = "MADAM";
		int len = str.length();
		String rev="";
		
		for (int i = len-1 ; i >= 0 ; i--) 
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println(rev + " is  Plindrome" );
		}
		else
		{
			System.out.println(rev + " is  Not a Plindrome" );
		}
	}

}
