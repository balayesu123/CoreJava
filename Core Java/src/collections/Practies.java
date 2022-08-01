package collections;

public class Practies {

	public static void main(String[] args) {
		
		String s ="ba#n&ga@lor ca%pi$ta@l i@s K#a*rna&t%a%ka";
		
		String str = s.replaceAll("[^a-zA-Z\\s]", "");
		System.out.println(str);
		
		String arr[] = str.split(" ");
		
		for(String w : arr )
		{
			   char ch = w.charAt(0);
               String upr = String.valueOf(ch).toUpperCase();
                   String sub = w.substring(1);
                   StringBuilder sb=new StringBuilder(sub);
                   sb.reverse();
                   System.out.print(upr+sb+" ");

		}
	}
	

}
