package exceptions;

public class UserDefined_NullpointException extends Exception {
	public UserDefined_NullpointException(String s)
	{
		super(s);
	}
   static void display() throws UserDefined_NullpointException
   {
	   String s=null;
	   
	   if(s==null)
	   {
		   throw new UserDefined_NullpointException("NullpointException"); 
	   }
	   else
	   { 
		   int l=s.length();
		   System.out.println("length of the given String is : "+l);
	   }
   }
   public static void main(String[] args) throws UserDefined_NullpointException {
	   display();
}
}
