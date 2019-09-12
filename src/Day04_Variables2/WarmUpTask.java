package Day04_Variables2;

public class WarmUpTask {

	/*
	 1. Cucumber 	= 2.5 => float or double 
	 2. Tomato 		= 3
	 3. Onion 		= 1.5 => float or double
	 4. Pepper 		= 2
	 5. Carrot 		= 4
	 */
	
	public static void main(String[] args) {
		//Cucumber:
	//	int Cucumber = 2.5; we can only assign whole numbers to int, byte, short, long
		
	// float Cucumber = 2.5; //float can not contain double
		float Cucumber = 2.5f;
		double Cucumber2 = 2.5f; //double can contain float
		double Cucumber3= 2.5;
		
		// Onion: 1.5
		float Onion = 1.5F;
		double Onion2 = 1.5;
		
		//Green pepper: 2$
		byte GreenPepper = 2;
		short GreenPepper2 = 2;
		int GreenPepper3 = 2;
		long GreenPepper4 = 2L;
		float GreenPepper5 = 2;//only time we add f or F is, when are assigning 
		double GreenPepper6 = 2;
		
		System.out.println(GreenPepper);
		System.out.println(GreenPepper2);
		System.out.println(GreenPepper3);
		System.out.println(GreenPepper4);
		System.out.println(GreenPepper5);
		System.out.println(GreenPepper6);
		
		
		
	}
}
