package polymorphism;

public class MainMethod_Overloading {
	
     public static void main(int args) {
		
       System.out.println("overloaded int arg method" + args);
	}
     
     public static void main(boolean args) {
    	 
    	 System.out.println("overloaded boolean arg method" + args);

 	}

	public static void main(String[] args) {
		
		System.out.println("MAIN String arg method");
		
		main(10);
		
		main(true);
	}

}
