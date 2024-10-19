package number_Programs;

public class SwapingNumbers {

	public static void main(String[] args) {
		
		// swaping of two numbers with temp variable
		
				int a=10;
				int b=20;
				
				System.out.println("Swaping with temp variable");
				
				System.out.println("Before swaping"+ " : a = "+ a + ", b = "+ b);
				
				
				int temp = a;
				a = b;
				b = temp;
				
				System.out.println("After swaping"+ " : a = "+ a + ", b = "+ b);
				
				
				// swaping of two numbers without temp variable
				
				int x=10;
				int y=20;
				
				System.out.println("Swaping without temp variable");
				
				System.out.println("Befor swaping"+ " : x = "+ x + ", y = "+ y);
				
				x = x+y;
				y = x-y;
				x = x-y;
				
				System.out.println("After swaping"+ " : x = "+ x + ", y = "+ y);
	}

}
