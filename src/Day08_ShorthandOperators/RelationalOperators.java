package Day08_ShorthandOperators;

public class RelationalOperators {

	/*
	 All relational Operators: return boolean expression
	 >  : greater than
	 >= : greater than or equal
	 <  : less than
	 <= : less than or equal
	 == : equal 
	 != : not equal
	 
	 =  : assign something
	 !  : exclamation mark in java means the logical opposite NOT
	 */
	
	public static void main(String[] args) {
		
		System.out.println (10>9);
		boolean resultA= 10>9;
		System.out.println (resultA);
		
		System.out.println (10>=9); // greater or equal
		boolean resultB= 10>=9;
		System.out.println (resultB);
		
		boolean resultC= 10<=9; //less than or equal
		System.out.println (resultC);
		
		boolean resultD= 1100 < 1200; //less than or equal
		System.out.println (resultD);
		
		boolean resultE= 1000 < 1000; //less than or equal
		System.out.println (resultE);
		
		boolean resultF= 1000 <= 1000; //less than or equal
		System.out.println (resultF);
		
	// ==
		boolean resultG= 19==19; // equal
		System.out.println (resultG);
		
		
	// !
		boolean resultH= 20 != 20; 
		System.out.println (resultH);
		
		boolean A= !false;  // true
		System.out.println (A);
		
		boolean B= !true;  // false
		System.out.println (B);
		
		/*
		 in java:
		 true == true, false == false
		 !false equal to true, !true equal to false
		 so therefore:
		 !false does not equal !true
		 and
		 true equal !false
		 */
		
		boolean C=!false != !true;
		System.out.println(C);
		
		 boolean D = true == !false ; 
         System.out.println(D);
         
         boolean E = !(!true);
         System.out.println(E);
         
         System.out.println( (int)(10.0/3));
     
        // practice ! (NOT) logical opposit 
         
         boolean g = false;
         System.out.println(!g);
         
         System.out.println(!true==false);
         //					false=false ==> true
         
        boolean h= "Batch12"=="Batch13"; //false
        System.out.println(h);
        
        System.out.println("batch12"=="Batch12"); //false - java is case sensitive
        System.out.println("cybertek"=!"club"); //true
        
	}
}
	
