package arrays;

public class Second_lagest_without_sorting {

	public static void main(String[] args) {
		int arr[]= {5,3,4,1,2,5};
		    int max = arr[0];
		    int secondmax=arr[1];
		    
		for (int i = 1; i < arr.length; i++) 
		{
			
			if(arr[i]>max)            
			{
				secondmax=max;
				 max=arr[i];	 
			}
			else if(arr[i]>secondmax && arr[i]!=max )      
			{
				secondmax=arr[i];
			}	
		}
		System.out.println("max value : " + max);
		System.out.println("secondmax value : " + secondmax);
		
	}

}
