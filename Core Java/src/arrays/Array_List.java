package arrays;

import java.util.ArrayList;

public class Array_List {
	
  public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("bala");
	list.add("pavan");
	list.add("sowmya");
	list.add("sunil");
	
	String str = list.get(1);
	System.out.println(str);
	
	   int len=str.length();
	   String rev="";
	   for (int i =len-1; i>=0; i--)
	   {
		rev=rev+str.charAt(i);
	   }
	   System.out.println(rev);
}
}
