package number_Programs;

public class Print_m_to_n_Numbers_PresentWith_2 {

	public static void main(String[] args) {

		int m =1;
		int n= 25;
 
		for(int i=m ; i<=n  ; i++)
		{
			int x=i; 
			while(x!=0)
			{
				int rem = x%10;
				if(rem==2)
				{
					System.out.print(i+" ");
				}
				x=x/10;
			}
		}

	}

}
