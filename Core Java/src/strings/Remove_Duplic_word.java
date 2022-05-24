package strings;

public class Remove_Duplic_word {

	public static void main(String[] args) {
		String s1="india pakistan india chaina";

		String[] arr = s1.split(" ");


		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i].equals(arr[j]))
				{
					arr[j]="0";
				}
			}
			
			if(arr[i]!="0") {
				System.out.println(arr[i]);
			}
		}
	}

}
