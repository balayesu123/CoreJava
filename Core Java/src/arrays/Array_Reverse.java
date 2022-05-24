package arrays;

public class Array_Reverse {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int len=a.length;
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	} 
}
