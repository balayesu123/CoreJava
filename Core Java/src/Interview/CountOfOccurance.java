package Interview;

public class CountOfOccurance {

	public static void main(String[] args) {
		String s="java developper";
//		int l1=s.length();
//		String s1=s.replaceAll("e", "");
//		int l2=s1.length();
//		System.out.println("Number of occurences of 'e': "+(l1-l2));
		
	  
		//  APPROACH 2	occurance of charactor
		
		    int count=0;
		for(int i=0; i<s.length() ; i++)
		{
			if(s.charAt(i)=='e')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
