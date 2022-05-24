package exceptions;

public class Exception_HandleBlocks {
	public static void main(String[] args)
	{
		try
		{
			int x=10/0;
	        System.out.println(x);
		}
		catch(ArithmeticException e)
		{
			 System.out.println("AE Handled");
		} 
		
       try
       {
    	   
    	   int a[]=new int[3];
	        a[0]=10;
	        a[1]=20;
	        a[2]=30; 
	        a[3]=40;
         System.out.println(a[3]);
         
       }
       catch(ArithmeticException a)
       {
    	   System.out.println("AIOOBE Handled");
       }
       finally
		{
			int b[]=new int[3];
	        b[0]=10;
	        b[1]=20;
	        b[2]=30;
	       System.out.println(b[2]);
		}
		
}
}