package emberson;

import java.util.Scanner;

public class TrafficLights_MainMethod {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Enter Time");

		for(int time=0 ; time>=0 ; time++)
		{	
			time=input.nextInt();
			String signal = Taffic_Lights.trafficLights(time);
			System.out.println(signal);
			if(signal.contains("GREEN = MOVE"))
			{
				break;
			}     
		}


	}

}
