package exceptions;

public class ThrowsMain {
public static void main(String[] args) {
	Throws2 t=new Throws2();
	try
	{
		t.methode2();
	}
	catch(ArithmeticException e)
	{
		System.out.println("ArithmeticException Handled");
	}
}
}
