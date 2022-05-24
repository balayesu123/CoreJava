package exceptions;

public class Terminatons {
	static void abnormal_Termination()
	{
		int a=10;
		int b=0;
		int x=a/b;
		System.out.println(x);
	}
	static void forcefull_Termination()
	{
		int a=10;
		int b=2;
		int x=a/b;
		System.out.println("stop exicution");
		System.exit(0);//forcefull termination
		System.out.println("continue exicution");
		System.out.println(x);
	}
	public static void main(String[] args) {
		abnormal_Termination();
		forcefull_Termination();
	}
}
