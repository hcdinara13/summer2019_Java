package Day06_ArithmaticOperator;

public class ArithmaticOperators {
	
	public static void main(String[] args) {
		int a=100;
		int b=a-400; //-300
		
		System.out.println(b);
		
		int c=a+b; //100+ -300 = -200
		System.out.println(c);
		
		
		int x=3, y=5, z=x*y;
		System.out.println(z); //15
		
		int length = 100, width = 10, area = length*width; 
		System.out.println(area);
		System.out.println(3 + 5 + 4 - 2);
		
		//double resultNum=9/0;
		//denominator can not be zero
		//System.out.println(resultNum);
		
		double Number1 = 10/3.0; //3.333
		double Number2=10/3; 
		System.out.println(Number1);
		
		int output = 12+6/3;
		//           18/3=6
		//           12+2=14
		System.out.println(output);
		
		System.out.println(5+2*4);//13
		System.out.println(5+4*2);//13
		
		System.out.println(10/2-3);//2
		
		System.out.println(8+12*2);//32
		
		/*
		 * Arithmatic operators
		 + : addition
		 - : subtraction
		 * : mutiplication
		 / : devision
		 % : remiander
		 
		 
		 
		 % :
		 
		 10/3  ==> 3 with remainder of 1
		 12/5  ==> 2 with remainder : 12  -5*2 = 2
		 20/2  ==> 6 with remainder 2
		 
		 
		 even number: can be devided by 2 without a reminder
		 odd number : devided by 2 will have reminder
		 
		  */
		
		int Number20 = 20 % 2; //even
		int Number45 = 45 % 2; //even
		
		System.out.println(Number20);
		System.out.println(Number45);
	}

}
