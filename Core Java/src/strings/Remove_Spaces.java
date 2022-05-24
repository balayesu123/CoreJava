package strings;

public class Remove_Spaces {
  public static void main(String[] args) {
	String s="My Name Is Blayesu ";
	String rs=s.replaceAll("\\s", "");
	System.out.println(rs);
}
}
