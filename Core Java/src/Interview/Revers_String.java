package Interview;

public class Revers_String {

	public static void main(String[] args) {
		
	//	i/p String str = "Celsior"
	//	o/p String revStr = roisleC
		
		String str= "Celsior";
		
		String revStr="";
		
		for(int i=str.length()-1 ; i>=0 ; i--)
		{	
			revStr = revStr+str.charAt(i);
		}
		System.out.println(revStr);

	}

}
