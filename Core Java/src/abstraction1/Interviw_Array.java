package abstraction1;

public class Interviw_Array {

	public static void main(String[] args) {
		
		//Input:  {12, 35, 1, 10, 34, 1}
		//Output: The second largest element is 34.
		
		int arr[]={12, 35, 1, 10, 34, 1};
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("second largest number : "+arr[arr.length-2]);

	}

}
