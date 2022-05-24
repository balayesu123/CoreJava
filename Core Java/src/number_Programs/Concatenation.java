package number_Programs;

public class Concatenation {
  public static void main(String[] args) {
	System.out.println("free+20"); // free+20
	System.out.println("free"+20); // free20
	System.out.println("free"+20+30+"charge"); // free2030charge
	System.out.println(20+30+"charge"); //50charge
	System.out.println(20+30+"charge"+20+30); // 50charge2030
	
	System.out.println(10 + 20 + 'a' + 'b' + "java");  // 225java
	System.out.println('a' + 'b' + "java");  // 195java
	System.out.println("java" + 'a' + 'b'); // javaab
	System.out.println(10 +'a' +"java" + 'a' + 'b');  // 107javaab
	
	//System.out.println(true+false);  we con't add boolean values throw error
	//System.out.println(true + 'a' + 'b');  not possible throw error
	//System.out.println(true + 10);   not possible
	//System.out.println( 10 +false);   not possible throw error
	//System.out.println(false+10+"java");  not possible throw error
	//System.out.println(false +20.50+'a'+"charge"+20+'b'+true);  not possible throw error 
	
	System.out.println(20+'a'+"charge"+20+'b');  // 117charge20b
	System.out.println(20.65+'a'+"charge"+20+'b'); // 117.65charge20b
	System.out.println(20+'a'+"charge"+20+'b'+true);  // 117charge20btrue
	System.out.println(false+"java");  // falsejava
	System.out.println("java"+true);  // javatrue
	System.out.println(false+"java"+true);  // falsejavatrue
}
}
   