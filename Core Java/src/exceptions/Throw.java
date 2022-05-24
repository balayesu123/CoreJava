package exceptions;

public class Throw {
	
	 static void sample(int age) {
	 if(age>=18)
	   {
		  System.out.println("Eligible for vote");
	   }
	   else
	   {
		   throw new ArithmeticException("Not eligible for vote"); 
	   }
	 }
   public static void main(String[] args) {
	     sample(17);  
}
}
