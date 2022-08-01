package arrays;

public class UniqueElements_of_Two_Arrays {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {1,6,3,7,5};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < b.length; j++) {
				
				if (a[i]==b[j]) {
					
					//System.out.print(a[i]+" ");  // Duplicate Elements 1 3 5
					a[i]='0';
					b[j]='0';
				}
			}
			if(a[i]!='0' && b[i]!='0')
			{
				System.out.print(a[i]+" "+b[i]+" ");  // Unique elements 2 6 4 7
			}
			
		}

	}

}
