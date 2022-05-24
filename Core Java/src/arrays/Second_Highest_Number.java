package arrays;

public class Second_Highest_Number {
  public static void main(String[] args) {
	int a[]= {100,88,99,77,66};
	int temp;
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=i+1; j<a.length;j++)
		 {
			 if(a[i]>a[j])
			 {
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			 }
		 }
		// System.out.print(a[i]+" ");//Asendin order
	 }
	 System.out.println(a[a.length-2]);
}
}
