package arrays;

public class SumOfPair_Equalsto_7 {

	public static void main(String[] args) {
		int arr[]= {2,4,3,5,6,-2,4,7,8,9};
		int sum = 7;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j] == sum)
				{
					System.out.print("("+arr[i]+","+arr[j]+")");  // o/p = (2,5)(4,3)(3,4)(-2,9)
				}
			}
		}  

		//   ****** 2nd Approach *****

		/*     int arr[]= {2,4,3,5,6,-2,4,7,8,9};
		       Arrays.sort(arr);

		       int sum=7;

		       int low=0;
		       int high=arr.length-1;

		       while(low < high)
		       {
		    	   if(arr[low] + arr[high] > sum)
		    	   {
		    		   high--;
		    	   }
		    	   else if(arr[low] + arr[high] < sum)
		    	   {
		    		   low++;
		    	   }
		    	   else if(arr[low] + arr[high] == sum)
		    	   {
		    		   System.out.println("("+arr[low]+","+arr[high]+")");
		    		   low++;
		    		   high--;
		    	   }
		       } */
	}

}



