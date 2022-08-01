package strings;

public class Lower_Upper_Count {

	public static void main(String[] args) {
   
		  String str="I Am BalaYesu";
		String s = str.replaceAll(" ", "");
		  int uppercount=0,lowercount=0;
		  String upper="",lower="";
		  
		  for(int i=0;i<s.length();i++)
		  {
			char ch=s.charAt(i);
			// if(ch>='A' && ch<='Z')      //  (ch>=65 && ch<=90)     // Character.isUpperCase(ch)
			 if (Character.isUpperCase(ch))
			 {
				 uppercount++;
				 upper=upper+s.charAt(i);
			 }
			 else
			 {
				 lowercount++;
				 lower=lower+s.charAt(i);
			 }
		  }
			System.out.println(upper+" = "+uppercount);
			System.out.println(lower+" = "+lowercount);
		}
	}

