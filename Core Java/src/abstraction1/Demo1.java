package abstraction1;

public class Demo1 extends Demo {
	public void sample()
	{
	  System.out.println("sample");
	}
	public void display()
	{
	  System.out.println("display");
	}
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		d1.sample();
	}
}
