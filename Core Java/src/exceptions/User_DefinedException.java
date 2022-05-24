package exceptions;

public class User_DefinedException extends Exception {
    public static void main(String[] args) throws User_DefinedException {
		int age=15;
		if(age>=18)
		   {
			  System.out.println("Eligible for vote");
		   }
		   else
		   {
			   throw new User_DefinedException(); 
		   }
	}
}
