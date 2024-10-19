package strings;

public class Continue_and_Break {

	public static void main(String[] args) {
		
		String s = "balayesu";
		int count = 0;
		System.out.println(" ******* continue *******");
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a')
			{
			  System.out.println("balayesu");
			  continue;  // when condition is true,skip the current iteration of remaining steps after continue key word
			}            // and control will back to the loop
			             // continue or break should use in last in the block
			             // we con't use continue & break in one block
			count++;
		}
		System.out.println(count);
		
		System.out.println(" ******* Break *******");
		
		// ******* Break *******
		
		String str = "balayesu";
		int breakcount = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a')
			{
			  System.out.println("balayesu");
			  break;    // when condition is true completely stop the current iteration
			}
			breakcount++;
		}
		System.out.println(breakcount);

	}

}
