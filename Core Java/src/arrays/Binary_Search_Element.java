package arrays;

import java.util.Arrays;

public class Binary_Search_Element {
  public static void main(String[] args) {
    int a[]= {10,60,30,40,50,10};//elements should be sorted order
    
    //approach 1
    
    int key=70;
   int l=0;
   int h=a.length-1;
   boolean flag=false;
   while(l<=h)
   { 
	   int m=(l+h)/2;
	   if(key==a[m])
	   {
		   System.out.println("Element is Found...");
		   flag=true;
		   break;
	   }
	   if(key>a[m])
	   {
		 l=m+1;  
	   }
	   if(key<a[m])
	   {
		 h=m-1;
	   }
   }
   if(flag==false)
   {
	   System.out.println("Element is not Found...");
   }
         //****approach2****
   // System.out.println(Arrays.binarySearch(a, 60));
}
}
