package Interview;

public class Pract {

	public static void main(String[] args) {
		String s="java developper";
		char c='e';
		int count=0;
		for(int i=0; i<s.length() ; i++ )
		{
		  if (i==c)
		  {
		    count++;
		  }
		}
		System.out.println(count);
	}

}
