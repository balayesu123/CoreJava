package Interview;

public class CountOfChar {

	public static void main(String[] args) {
		
		// i/p String str = "aadaccffba";
		// o/p  a = 4
//		        d = 1
//				c = 2
//				f = 2
//				b = 1
		
		String s= "aadaccffba";

		char ch[]=s.toCharArray();

		for (int i = 0; i < ch.length;i++)
		{

			int count = 1 ;
			if(ch[i]!='0') {
				for (int j = i+1; j < ch.length; j++) 
				{

					if(ch[i]==ch[j])
					{
						count ++;	
						ch[j]='0';
					}
				}
				System.out.println(ch[i] +" = "+count);
			}

		}

	}
}


