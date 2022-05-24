package number_Programs;

public class Faboniciseries {

	public static void main(String[] args) {
	   
		int n=5,n1=0,n2=1;
		System.out.print(n1+" "+n2);
		for(int i=2 ; i<n ;i++)  // for(int i=1 ; i<=n-2 ;i++)
		{
			int sum=n1+n2;
			System.out.print(" "+sum);
			  n1=n2;
			  n2=sum;
			 
		}

	}

}
