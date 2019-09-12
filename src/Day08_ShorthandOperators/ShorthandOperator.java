package Day08_ShorthandOperators;

public class ShorthandOperator {
	
	/*
	 += :addition assignment
	 -= :subtraction assignment
	 *= :multiplication assigment: x*=y==> x=x*y
	 /= :division assignment ; x/=y ==> x = x/y
	 %= :remainder assignment: x
*/

	public static void main(String[] args) {
		
		//+=:
		int a=9;
		// a= a+3; //12
		a+= 3; // a = a+3
		
		System.out.println(a); //12
		
		int  b = a+=5; //a=17
		    //  12+=5 ==> 12+5=17 
		System.out.println(b);
		
		int  c = a+=b; 
	    //  17+=17 34 
	System.out.println(c);
	
		int  d = a+=c; // a=68, d=68, c=34, b=17
		//  34+= 34 
		System.out.println(d);

		int  e = (d+=b) * 2;
		//  (68+17) * 2 
		//  85 * 2 = 170
		System.out.println(e);
		
		 System.out.println(e);  // d = 85, b 17, e= 170, c=34
	        System.out.println(d); // 85
	        System.out.println(c); // 34
	        System.out.println(b); //17

	        // d= 85 , b=17, e = 170, c= 34
	        int f = b += d  * 2;        
	        //     b += 170;
	        //     17 +=170  ==> 187
	        
	        System.out.println(f);
	        // b= 187   
	       
	        
	        //-=:
	        
	        int g= 101;
	        int h = g-=1;
	        		//	101-=1 ==>100
	        		System.out.println(h);
	        		
	        int i = g+=h+5; // g=205, i=205, h=100
	        //100+=100+5 ==>205
	        System.out.println(i);
	        
	        int j = h+=g%i; // h=100, j=100
	        // 100 += 205 % 205
	        // 100 += 0
	        System.out.println(j);
	        
	        
	       int k = j-=h*2%5; // j=100
	       //      j-=200%5
	       //      100-=0
	       System.out.println(k);
	       
	       //MULTIPLICATION
	       
	       int A = 100;
	       A*=200;
	       //A=A*200=20000
	       System.out.println(A);
	       
	       int B = 100;
	       		B*=100/10;
	       	//	B*=100/10 100*100/10==>1000
	       	 System.out.println(B);
	       	 
	       	B*= B-=1000;
	       //	1000*=1000-1000==> 1000*=0 ==>0
	        System.out.println(B);
	        
	   //DIVISION
	        
	        int C= 1000;
	        	C /=5;
	        	System.out.println(C); 
	        	
	        int D=10;
	        // C/=D-10; denominator cant be zero
	        System.out.println(C); // C=200 
	        
	        C /=D+10; //C / 20 ==> 200/20 ==>10
	        System.out.println(C);
	        
	   //REMAINDER %
	        
	        int z = 10%3; // ==> 10/3=3... remainder 10-3*3 = 1
	        
	        int E = 10;
	        E %=2; // E = 10%2
	        System.out.println(E);
	        
	      // how to verify odd number and even number
	        
	        int F = 100;
	        	F%=2; // F = F%2; ==>0 even number
	        	// if its zero ==> EVEN number
	        	// if it gives number other than 0 ==> ODD number
	        
	        	 System.out.println(-100%3);
	        	 System.out.println(10.5%3);
	        	 //               10.5 /3 = 3  remainder: 10.5-3*3 = 1.5
	        	/*
	        	 remainder cannot be negative:
	        	 when we divide a number there will be either remainder 
	        	 */
	        
	        	 int J=300;
	        	 int K=10;
	        	 
	        	 J += J%K;
	        	 //300+=300%10 ==> 300+=0 ==> 300
	        	 System.out.println(J);
	}
}
