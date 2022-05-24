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

	}

}
