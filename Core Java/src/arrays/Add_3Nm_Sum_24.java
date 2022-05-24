package arrays;

public class Add_3Nm_Sum_24 {
   public static void main(String[] args) {
	
	   int a[]= {12,4,5,7,8};
	   int sum=0;
	   for (int i = 0; i < a.length; i++) {
		    if(a[i]%2==0)
		    {
		    	 sum=sum+a[i];
		    }
	}
	   System.out.println(sum);
}
}
