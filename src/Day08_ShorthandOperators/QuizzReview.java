package Day08_ShorthandOperators;

public class QuizzReview {

	public static void main(String[] args) {
		//verify even or odd ==> remainder operator
		int num=198;
		System.out.println(num %= 2);
		
		byte BNum = 30;
	//	int Inum= Inum += BNum 
				
		//local variable must be given value, otherwise you get compile error
		
		//question01
		
		int ivar = 100;
		double dvar =200;
		float fvar = 300;
	//	ivar = fvar - compile error coz float > int
		fvar = ivar; //any float number can be assigned to decimal
		dvar = fvar; // !false double >float
	//	fvar = dvar; // !true double > float
		dvar = ivar; // !false
	//	ivar = dvar; //error
		
		
		
	}
}
