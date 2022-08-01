package strings;

public class Extract_numrs_From_String_and_Add {

	public static void main(String[] args) {
		
		String str="hddsue25jdkh42jd25";
		
		String strNum="";
		int digit=0;
		for(int i=0 ; i<str.length() ; i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
			  // convert char to String and then String to int
				
				//strNum=String.valueOf(ch);
				//digit=digit+Integer.parseInt(strNum);	
				
				//************* OR ***************
				
				digit=digit+Character.getNumericValue(ch); // this method returns integer values
				
			}
			
		}
       System.out.println(digit);
       
       // ************** 2nd Method ***************
       
     /*  for(int i=0 ; i<str.length() ; i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				strNum=strNum+ch;
			}
			else if(!strNum.equals(""))
		   {
			digit=digit+Integer.parseInt(strNum);
			strNum="";
		   }
			
		}
      System.out.println(digit); */
	}

}
