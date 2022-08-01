package emberson;

public class SumOfEven_ProductOfOdd_Numbers {

	public static void main(String[] args) {
		
         int arr[]= {1,2,3,4,5,6,7,8,9,10};
         int sum=0,product=1;
         for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
			else
			{
				product=product*arr[i];
			}
		}
         System.out.println("sum of even numbers :"+sum);
         System.out.println("Product of odd numbers :"+product);
	}

}
