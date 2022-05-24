package number_Programs;

import java.util.Iterator;

public class PrimeNm_Bw_100_200 {

	public static void main(String[] args) {
		int m=100 , n= 200;
		for (int i = m; i <= n; i++) {
			  int count=0;
			for (int j = 1; j <=i ; j++) {
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
			
		}
	}
}
