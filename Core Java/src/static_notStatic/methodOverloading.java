package static_notStatic;

public class methodOverloading {
	
	public static void sample(int a)
	{
       System.out.println("a");
	}
	public static void sample()
	{
		System.out.println("b");
	}

	public static void main(String[] args) {

		//methodOverloading m=new methodOverloading();
               sample(10);
	}

}
