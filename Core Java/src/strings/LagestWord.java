package strings;

public class LagestWord {

	public static void main(String[] args) {
		
//		String s="balayesu bala esu AkulaBalayesu";
//		String str[]=s.split(" ");                         
//		String word="";
//		int max=0;
//		for(int i=0;i<str.length;i++)
//		{
//			int len = str[i].length(); 
//
//			if(len > max )
//			{
//				max = len ;
//				word=String.valueOf(str[i]);
//			}
//		}
//		System.out.println(word +" = "+ max);
		
		// ********* 2nd Approach ********
		
		String str2= "Sri ravi balayesu khgaga";
		String sp[] = str2.split(" ");
          String lagrwd="";
          int maxlen=0;
		for(String w : sp)
		{
			int le = w.length();
			if(le > maxlen)
			{
				maxlen = le ;
				lagrwd = w;
			}
			
		}
		System.out.println(lagrwd +" = "+maxlen);
			 
	}

}
