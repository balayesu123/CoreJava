package strings;

public class Immutable {

	public static void main(String[] args) {
		
		String s= "bala";
		String s2="bala";
		String s3="bala";
		String s1= "balayesu";
		
		s="yesu";  // here   changed the String s value
		
		System.out.println(s1.toString());  // o/p = balayesu
		System.out.println(s.toString());  // it  will create a new object  o/p = yesu
		System.out.println(s.hashCode()); // o/p :3705454 here hashCode is overrided Based on data  it give integer type value
		System.out.println(s2.toString());  // s2 and s3 are pointed to the same object  o/p = bala
		System.out.println(s3.toString()); // o/p = bala
		System.out.println(s2.hashCode());  // 3016180  here hashCode is overrided Based on data  it give integer type value
		System.out.println(s3.hashCode());   // 3016180
		
         StringBuilder str = new StringBuilder(s1);  // converting the String literal to StringBuilder 
         System.out.println(str.toString());  // balayesu
         System.out.println(str.hashCode());  // StringBuilder and StringBuffer here hashCode is not overrided it give integer type Address o/p = 305808283
         System.out.println(str.append(" "+"Akula")); // here i am adding to String data Akula ---> o/p = balayesu Akula
                                                      // it won't create new object
         System.out.println(str.reverse()); // alukA useyalab
         System.out.println(str.hashCode()); // o/p = 305808283  here won't change the address
	}

}
