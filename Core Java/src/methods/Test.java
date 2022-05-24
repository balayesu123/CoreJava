package methods;

public class Test {
   
	// constructor chaining
	
		public Test()
	    {
	        System.out.printf("1");
	        new Test(10);
	    // By 'new Test()' the default constructor of the class is invoked and no memory will be allocated 
	    // as there's no address(object name) given to it.
	        System.out.printf("5");
	    }
	   
		public Test(int temp)
	    {
	        System.out.printf("2");
	        new Test(10, 20);
	        System.out.printf("4");
	    }
	   
		public Test(int data, int temp)
	    {
	        System.out.printf("3");

	    }

	    public static void main(String[] args)
	    {
	        Test obj = new Test();
	    }
}
