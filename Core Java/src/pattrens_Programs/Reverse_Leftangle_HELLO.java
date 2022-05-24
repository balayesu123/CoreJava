package pattrens_Programs;

public class Reverse_Leftangle_HELLO {
  public static void main(String[] args) {
	int hello=6;
	for (int i = 1; i <= 5; i++) {
		hello--;
		for (int j = 1; j <=hello; j++) {
			if(j==1)
			{
				System.out.print("H");
			}
			else if(j==2)
			{
				System.out.print("E");
			}
			else if(j==3||j==4)
			{
				System.out.print("L");
			}
			else
			{
				System.out.print("O");
			}
		}
		System.out.println("");
	}
}
}
