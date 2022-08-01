package strings;

public class Separate_Char_Num_Sym_and_Count {

	public static void main(String[] args) {
		
		String s= "Bala123@#$ur45&";
		
		int charCount=0, digitCount=0, symCount=0;
		String chare="", digit="", sym="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(Character.isLetter(ch))
			//if(Character.isAlphabetic(ch))  // method to compare char
			//if((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z'))  // compar characters 
			//if((ch >= 65 && ch <= 90)||(ch >= 97 && ch <= 122))	 // compare asci values 
			{
				charCount++;
				chare=chare+s.charAt(i);
			}
			else if(Character.isDigit(ch))
			//else if(ch >= '0' && ch <= '9')
		   // else if(ch >= 48 && ch <= 56)	
			{
				digitCount++;
				digit=digit+s.charAt(i);
			}
			else
			{
				symCount++;
				sym=sym+s.charAt(i);
			}
			
		}
		System.out.println(chare+" = "+charCount);
		System.out.println(digit+" = "+digitCount);
		System.out.println(sym+" = "+symCount);
		//System.out.println("character = "+charCount+" Digitis = "+digitCount+" Symble = "+symCount);
		//System.out.printf("characters = "+charCount+"%nDigitis = "+digitCount+"%nSymbles = "+symCount);

	}

}
