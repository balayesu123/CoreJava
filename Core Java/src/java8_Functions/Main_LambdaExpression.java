package java8_Functions;

public class Main_LambdaExpression {

	public static void main(String[] args) {
		
//		Lambda_Expression le=new Lambda_Expression() 
//		{
//			@Override
//			public void sample()
//			{
//				System.out.println("implements the Abstract Method");
//				
//			}
//		};	
		
//		le.sample();
		
		
		//  lambda Expression
		
		Lambda_Expression le = () -> {System.out.println("implements the lambda Expressions");};
		
                le.sample();

		
	}

}
