package arrays;

public class Remove_Dupli_Ele {
  public static void main(String[] args) {
	 
	int a[]= {1,3,2,6,3,};
	
	for (int i = 0; i < a.length; i++) 
	{
		
		for (int j = i+1; j < a.length; j++)
		{
			 if(a[i]==a[j])
			 {
				 a[j]='*';
				 
			 } 
		}
		if(a[i]!='*')
		{
			System.out.print(a[i]+" ");
		}
	}
}
}
