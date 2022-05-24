package strings;

public class Print_Vowels_Consonents {

	public static void main(String[] args) {


		String s = "AbcdefGHIjklmnopqRStuvwxyZ";
		//String s = "Kanerika is Located in Hyderabad";
		char[] ch = s.toCharArray();
		int vowel_count=0;
		for(int i =0 ; i<ch.length ; i++ )
		{
			if((ch[i]=='a' || ch[i]=='A') || (ch[i]=='e' || ch[i]=='E') || (ch[i]=='i' || ch[i]=='I') || (ch[i]=='o' || ch[i]=='O') || (ch[i]=='u' || ch[i]=='U'))
			{
				vowel_count++;
				System.out.print(ch[i]+" ");
				ch[i]='0';
				
			}
		}
		System.out.println();
		System.out.println("Vowels : "+vowel_count);
          
		int consonents_count=0;
		for(int i =0 ; i<ch.length ; i++ )
		{
             
			if(ch[i]!='0')
			{
				consonents_count++;
				System.out.print(ch[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Consonents : "+consonents_count);

	}

}
