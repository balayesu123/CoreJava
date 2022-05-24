package exceptions;

public class Throws_Singleclass {
  
static void demo1(String s) throws NumberFormatException
   {
	  System.out.println(Integer.parseInt(s));
   }
   static void demo2(String s)throws NumberFormatException
   {
	   demo1(s);
   }
   public static void main(String[] args) {
	   try { 
	   demo2("abc");
	   }
	  catch(NumberFormatException a)
	   {
		  System.out.println("Handled");
	   }
}
}
