package strings;

public class Remove_Duplic_word {

	public static void main(String[] args) {
	/*	String s1="india pakistan india chaina india";

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
				System.out.print(arr[i]+" ");
			}
		}

		// ************2nd Approach***************

		String str = "abcd bala yesu bala Krishna yesu";
		String s[] = str.split(" ");
		String rmv = "";

		for(int i=0 ; i<s.length ; i++)   
		{
			String word = s[i];
			int index = rmv.indexOf(word);

			if(index == -1)
			{
				rmv = rmv+word+" ";

			}
		}
		System.out.println(rmv);  */
		
		// ************3rd Approach***************

				String str1 = "abcd yesu bala Krishna yesu";
				String split[] = str1.split(" ");
				String rmvDp = "";

				for(String w : split)   
				{	
					int index = rmvDp.indexOf(w);

					if(index == -1)
					{
						rmvDp = rmvDp+w+" ";

					}
				}
				System.out.println(rmvDp);
	}

}
