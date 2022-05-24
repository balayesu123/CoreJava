package widening;

public class PrintAtoZ {

	public static void main(String[] args) {
		
        for (int i = 65; i <= 90 ; i++) {
        	
        	char ch=(char)i;  // narrowing
        	System.out.print(ch +" ");
		}
	}

}
