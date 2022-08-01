package strings;

public class Concatenate_Strings {

	public static void main(String[] args) {
		
		String s1="abc";
		String s2="xyz";
		String s3="pqr";
		
		System.out.println(s1+s2+s3);  // abcxyzpqr
		System.out.println(s1.concat(s2).concat(s3));  // abcxyzpqr
		
		String s="java,manual,selenium,Api";
		String str[] = s.split(",");
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
	}
}
