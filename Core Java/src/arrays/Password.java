package arrays;
 import java.util.Scanner;
import java.util.regex.*;
 
public class Password {
  public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	  System.out.println("enter your password");
	  String psw=input.next();
	//Pattern p=Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{8,12})");
	Pattern p=Pattern.compile("(?=.*[0-9a-zA-Z])(?=.*[!@#$%^&*]).{8,12}");
	Matcher m=p.matcher(psw);
	System.out.println(m.matches());
}
}
