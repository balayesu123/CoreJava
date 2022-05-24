package exceptions;

public class NumberFormateException {
  
    static void print()  
    {
    	try
		{ 
			String s="abc";
			Integer.parseInt(s);
			System.out.println(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException handled");
		}
    }
    public static void main(String[] args)  {
    	print();
	}
}
