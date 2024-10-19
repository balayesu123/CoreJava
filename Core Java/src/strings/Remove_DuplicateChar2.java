package strings;

public class Remove_DuplicateChar2 {

	public static void main(String[] args) {
		
		String str = "MAADAMM";  
		StringBuilder modified = new StringBuilder(str);
		
		for(int i=0; i<modified.length(); i++)
		{
			
		    char ch1 = modified.charAt(i);
		    
		    for(int j=1+i ; j<modified.length(); j++)
		    {
		        char ch2 = modified.charAt(j);
		        
		        if(ch1 == ch2)
		        {		           
		             modified.deleteCharAt(j);
		             j--;
		        }
		        
		    }
		        
		}
		
		System.out.println(modified.toString());

	}

}
