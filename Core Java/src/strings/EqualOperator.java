package strings;

public class EqualOperator {

	public static void main(String[] args) {
	/*	String s="string";
		String s1=new String("string");
		String s2=new String("string");
		Object o=new Object();
		Thread t=new Thread();
		System.out.println(s1==s); // false
		System.out.println(s2==s1); // false
		System.out.println(s2==o);  // false
		System.out.println(t==o);   // false  */
		
		String a="deepthi";
		String b=new String("deepthi");
		String c=new String("deepthi");
		String d="deepthi";
		
		System.out.println(a==b);      // false
		System.out.println(b==c);      // false
		System.out.println(c==a);       // false
		System.out.println(a.equals(c));   // true
		System.out.println(a==d);          // true
	}
}
