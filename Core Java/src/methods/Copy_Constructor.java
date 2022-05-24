package methods;

public class Copy_Constructor {
	
	int a;
	int b;
	
	public Copy_Constructor(int a, int b)   // normal _Constructor
	{
		this.a=a;
		this.b=b;
	}
	
	public Copy_Constructor(Copy_Constructor c)   // Copy_Constructor
	{
		a=c.a;
		b=c.b;
	}
	
	public void display()
	{
		System.out.println("a = "+ a +"  b = " + b);
	}

	public static void main(String[] args) {

		Copy_Constructor cp = new Copy_Constructor(10,20);
		
		Copy_Constructor cp1 = new Copy_Constructor(cp);
		
		cp.display();
		cp1.display();

	}

}
