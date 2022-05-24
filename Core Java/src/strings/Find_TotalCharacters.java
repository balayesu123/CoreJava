package strings;

public class Find_TotalCharacters {
  public static void main(String[] args) {
	String s="java deve lopper";
//	 String str="";
//	 int count=0;
//	 System.out.println("length of the string is: "+s.length());
//	for(int i=0;i<s.length();i++)
//    {
//      if(s.charAt(i)!=' ')	
//      {
//    	  str=str+s.charAt(i);
//    	  count++;
//      }
//	}
//	System.out.println("charectors of the given string:");
//	System.out.println(str +": "+count);
	
	// approach 2
	  
//	String s="java deve lopper";
//	String s1 = s.replaceAll(" ", "");
//	System.out.println(s1.length());
	
	// Approach 3
	
	    String str = s.replaceAll(" ", "");
	    int count = 0;
	    for (int i = 0; i < str.length(); i++) {
			
	    	count++;
		}
	    System.out.println(str +": "+count);
}
}
