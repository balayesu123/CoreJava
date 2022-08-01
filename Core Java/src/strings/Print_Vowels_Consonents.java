package strings;

public class Print_Vowels_Consonents {

	public static void main(String[] args) {


		String s = "AbcdefGHIjklmnopqRStuvwxyZ";
		//String s = "Kanerika is Located in Hyderabad";
		char[] ch = s.toCharArray();
		String vowel="",consonents="";
		int vowel_count=0, consonents_count=0;
		for(int i =0 ; i<ch.length ; i++ )
		{
			if((ch[i]=='a' || ch[i]=='A') || (ch[i]=='e' || ch[i]=='E') || (ch[i]=='i' || ch[i]=='I') || (ch[i]=='o' || ch[i]=='O') || (ch[i]=='u' || ch[i]=='U'))
			{
				vowel_count++;
				vowel=vowel+ch[i];				
			}
			else
			{
				consonents_count++;
				consonents=consonents+ch[i];
			}
		}
		System.out.println("Vowels : "+vowel+" = "+vowel_count);
		System.out.println("Consonents : "+consonents+" = "+consonents_count);
	}

}
