package exceptions;

public class Practies {

	public static void main(String[] args) {
		
       try
       { 
    	   System.out.println("throw Arithmetic Exception");
    	   int c= 10/0 ;
       }
       finally
       {
    	   System.out.println("execution is continue with finally block");
       }
       
	}

}
