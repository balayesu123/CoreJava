package strings;

public class Remov_Symbles {
  public static void main(String[] args) {
	String s="Ba!@la#$ye^&su*";
	 String str=s.replaceAll("[^a-zA-Z0-9]", "");
	 System.out.println(str);
}
}
