package arrays;

public class Practies {

	public static void main(String[] args) {
		
int arr[] = {2,1,4,1,3,4,2,1,5};
		
		int len = arr.length;
		
		for(int i=0 ; i<len ; i++)
		{
			int count =1;
			for(int j=i+1 ; j<len ; j++)
			{
				if(arr[i]==arr[j] )
				{
					count++;
                  arr[j]='0';
				}
			}
			if(arr[i]!='0' && count > 1)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
