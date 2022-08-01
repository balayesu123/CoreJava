package emberson;

public class Taffic_Lights {

	// traffic light system
	// inputs   between       
	// 0-20sec time - output is red   stop
	// 20-40 time - output is yellow  wait
	// 40-60 time  - output is green  move

	public static String trafficLights(int time)
	{
		if(time<=20)
		{ 	
			return "RED = STOP";
		}
		else if(time>20 &&  time<=40)
		{
			return "YELLOW = WAIT";
		}
		else if(time>40 &&  time<=60)
		{
			return "GREEN = MOVE";
		}
		return "Wrong input";

	}

}
