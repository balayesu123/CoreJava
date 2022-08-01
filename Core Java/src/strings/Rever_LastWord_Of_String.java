package strings;

public class Rever_LastWord_Of_String {

	public static void main(String[] args) {

		String str="software testing qspiders hyderabad";
		String split[]=str.split(" ");
		String revstr="";
		for(int i=0 ; i<split.length ; i++)
		{
			String last=split[split.length-1];
			if(split[i].equals(last))             // it will take the last word of given string
		   // if(split[i].contains("qspiders"))	 // it will take the specific word of given string
			{
				//String last=split[i];
				for (int j=last.length()-1 ; j>=0 ; j--) 
				{
					revstr=revstr+last.charAt(j);
				}
				System.out.print(revstr+" ");
				continue;
			}
			System.out.print(split[i]+" ");
		}
	}
}
