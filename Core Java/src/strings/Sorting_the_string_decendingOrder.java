package strings;

import java.util.Arrays;

public class Sorting_the_string_decendingOrder{
   public static void main(String[] args) {
	  
	   String s="dcab";
	   char arr[] = s.toCharArray();
	   
	   for (int i = 0; i < arr.length; i++) 
	   {
		   for (int j = i+1;j < arr.length; j++) 
		   {
			if(arr[i]<arr[j])
			{
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
			}
			   
		   }
		   System.out.print(arr[i]);
	   }
	  // System.out.println(Arrays.toString(arr));
	   
}
}
