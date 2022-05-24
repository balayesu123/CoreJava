package exceptions;

public class Un_Checked_Exception {
public static void main(String[] args) {
	try
	{
		//int x=10/0;
		//System.out.println(x);//ArithmeticException
		// ***************
		//int a[]=new int[2];
		//a[2]=10;
		//System.out.println(a[2]);//ArrayIndexOutOfBoundsException
		//**************
		//String s=null;
		//System.out.println(s.length());//NullPointerException
		//**************
		String s="abc";
		System.out.println(Integer.parseInt(s));//NumberFormatException
	}
	catch(Exception t)//we can Handle the exception by---> Throwable,Exception,RuntimeException
	{
		System.out.println(" Handled");
	}
	
}
}
