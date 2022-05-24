package strings;

public class Revers_word { 
  public static void main(String[] args) {
	  
	String str="my name is Balayesu";
	String a[]=str.split(" ");
	for(int i=a.length-1 ; i>=0 ; i--)
	{
		System.out.print(a[i]+" ");
	}
	
}
}
