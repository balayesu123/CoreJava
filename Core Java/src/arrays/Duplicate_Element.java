package arrays;

public class Duplicate_Element {

	public static void main(String[] args) {

		int a[] = {10,20,30,40,10};
		boolean flag = false;
		for(int i = 0 ; i< a.length ; i++)
		{
			for(int j = i+1 ; j < a.length ;j++)
			{
				if (a[i]==a[j])
				{
					System.out.println("Duplicates elements are  " + a[i]);
					flag = true ;

				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate elements are not present");
		}
		
		// ************** 2nd Approach *******************

      /*   int arr[] = {2,1,4,1,3,4,2,1,5};
		
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
	    }  */               
	}

}
