package strings;

public class Repetetive_Charactors {
  public static void main(String[] args) {
	String s="devellopparrellpppeeerrrf";
	int l=s.length();
	char[] ch=s.toCharArray();
	for(int i=0;i<l;i++)
	{
		int count=1;
		for(int j=i+1;j<l;j++)
		{
			if(ch[i]==ch[j])
			{	
				count++;
				ch[j]='0';
			}
		}
		if(ch[i]!='0')
		{
			if(count!=1)
			{
				System.out.println(ch[i]);
			}
		}
		
	}
}
}
