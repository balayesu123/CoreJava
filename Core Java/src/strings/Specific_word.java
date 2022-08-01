package strings;

public class Specific_word {

	public static void main(String[] args) {

		String s = "java good programing language";
		String str[] = s.split(" ");

		for(String word : str)
		{
			if(word.contains("programing"))
			{
				System.out.println(word);	
			}
		}

	}

}
