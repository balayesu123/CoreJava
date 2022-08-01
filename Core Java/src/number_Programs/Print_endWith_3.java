package number_Programs;

public class Print_endWith_3 {
    public static void main(String[] args) {
    	int n=100;
		for (int i = 1; i <= n; i++) {
			
			int rem=i%10;
			if(rem==3)
			{
				System.out.print(i+" ");
			}
		}
	}
    
}
