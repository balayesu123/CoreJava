package arrays;

public class AllPhabeticalOrder {
   public static void main(String[] args) {
	   String s[]= {"Sunil","padmaja","Urmila","shushank","Balayesu"};
	  // String s[]= {"S","p","U","r","B"};
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
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(s[i]);
	}
}
}
