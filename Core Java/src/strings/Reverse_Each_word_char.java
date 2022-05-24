package strings;

public class Reverse_Each_word_char {

	public static void main(String[] args) {

		String word = "I LOVE MY COUNTRY";
		String str[]=word.split(" ");
		
		String reverseStr ="";
		for (String eachWord : str)
		{
			String reversWord ="";

			for (int i = eachWord.length()-1; i>=0 ; i--)
			{
				reversWord = reversWord+eachWord.charAt(i);
			}
			reverseStr = reverseStr+reversWord+" ";
		}

		System.out.println(reverseStr);
	}

}
