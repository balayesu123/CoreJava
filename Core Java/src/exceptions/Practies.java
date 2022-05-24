package exceptions;

public class Practies {

	public static void main(String[] args) {
		
       try
       { 
    	   int c= 10/0 ;
       }
       catch(ArithmeticException e1)
       {
    	   System.out.println("AE Handled");
       }
       
	}

}
