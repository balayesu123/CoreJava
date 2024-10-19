package commandLineArguments;

public class CommandLineArgs {
	
	public static void main(String[] args) {
		
		/**
		 * In main method "String[] args" is the command line argument.
		 * Here we are passing the arguments to main method through command line.
		 * 
		 * 1.To pass Command line arguments through eclipse
		 * 2.Right click on the class which you want to Run
		 * 3.Navigate to "RunAs" option and Select "RunConfiguration" option.
		 * 4.Select the "(x)=Arguments" option
		 * 5.Go to "Program Arguments" text box and Pass the arguments by space separated EX: 10 20 30 40 ect.,
		 * 6.Click on "Run" button
		 * 
		 */
		 	
		int a =Integer.parseInt(args[0]);   // String[] args  will take String Array values so that we are converting the String values into Integer values
		int b =Integer.parseInt(args[1]);   // By type casting method
		
		int add = a+b;
		
		System.out.println(add);
		
	}

}
