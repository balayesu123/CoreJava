package pattrens_Programs;

public class HELLO_toCharArray {

	public static void main(String[] args) {
		String   a = "HELLO";
		char ch[]=a.toCharArray();
		for (int i =ch.length-1; i>=0 ; i--) {
			
			for (int j = 0; j <=i; j++) {
				
				System.out.print(ch[j]);
				}
			System.out.println("");
			}
	}

}
