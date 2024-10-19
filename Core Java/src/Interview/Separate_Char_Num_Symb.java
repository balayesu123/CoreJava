package Interview;

public class Separate_Char_Num_Symb {

	public static void main(String[] args) {
		// i/p String str = Pyramid@#$123
		// o/p   String chare = Pyramid
		//       String num = 123
		//       String sym = @#$
		
		String str = "Pyramid@#$123";
		
		String chare ="" ; String sym = "" ; String num = "";
		
		for(int i = 0 ; i<str.length() ; i++)
		{
                  char ch = str.charAt(i);
			
			if(Character.isLetter(ch))
			//if(Character.isAlphabetic(ch))  // method to compare char
			//if((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z'))  // compar characters 
			//if((ch >= 65 && ch <= 90)||(ch >= 97 && ch <= 122))	 // compare asci values 
			{
				
				chare=chare+ch;
			}
			else if(Character.isDigit(ch))
			//else if(ch >= '0' && ch <= '9')
		   // else if(ch >= 48 && ch <= 56)	
			{
				
				num=num+ch;
			}
			else
			{
				
				sym=sym+ch;
			}
		}
		System.out.println(chare);
		System.out.println(num);
		System.out.println(sym);

		
	}

}
