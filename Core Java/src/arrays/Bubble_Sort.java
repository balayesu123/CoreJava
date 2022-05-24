 package arrays;
import java.util.Arrays;
import java.util.Collections;
public class Bubble_Sort {
	
   public static void main(String[] args) {
	   
	int a[]= {40,30,50,20,10};
	
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j] > a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		
	}
	System.out.print("Narmal approch Accending order:"+Arrays.toString(a));
	
	//********Approch 2 Predefind methods***********
	
	/*Arrays.sort(a);
	System.out.print("By using predefind method: "+Arrays.toString(a));*/
	
	//*************Approch 3 Desending Order(Predefind methods)**********
	
     /* Integer b[]= {20,10,50,30,40};
      Arrays.sort(b,Collections.reverseOrder());
      System.out.println("Decending Order: "+Arrays.toString(b));*/
      
	
}
}
