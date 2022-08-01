package exceptions;

public class Multiple_Catch_Blocks {

	public static void main(String[] args) {
		
		String s=null;
		int a[]= {0,1,2,3};
		String str="abc";
		
		try
		{
			int value = a[4]/0;
			System.out.println(value);
			System.out.println(s.length());
			int x=Integer.parseInt(str);
			System.out.println(x);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("AIOOBE is Handled");
		}
		catch(ArithmeticException e)
		{
			System.out.println("AE is Handled");
		}
		catch(NullPointerException e)
		{
			System.out.println("NPE Hanhled");
		}
		catch(Exception e)  // NumberFormatException
		{
			System.out.println("Exception is Handled by Super Exceptiob Class");
		}

	}

}
