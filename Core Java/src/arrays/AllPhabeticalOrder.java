package arrays;

import java.util.Arrays;

public class AllPhabeticalOrder {
   public static void main(String[] args) {
	  // String s[]= {"Balayesu","Sunil","padmaja","urmila","shushank"};
	   String s[]= {"S","p","U","r","B"};
	  // String s[]= {"adc","acb","aec"};
	   int n=s.length;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			
			if(s[i].compareToIgnoreCase(s[j]) >= 0)
			{
				String temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
		}
		System.out.print(s[i]+" ");  // Balayesu padmaja shushank Sunil urmila
	}
	// System.out.println(Arrays.toString(s));  // [Balayesu, padmaja, shushank, Sunil, urmila]
}
}
