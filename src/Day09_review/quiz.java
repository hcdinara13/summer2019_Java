package Day09_review;

public class quiz {
	
	public static void main(String[] args) {
		boolean a = !!!!!false; //true 
		System.out.println(a);
		System.out.println(!!true); //true
		
		//question 2
		boolean result=!false!=("Batch12" != "Best batch ever");
		//             true  != true
		//                false
		System.out.println(result);
		
		//question 3
		
		int x=100;
		int y=x += 100/20;
		//  100+= 5 ==> 105
		System.out.println(x);
		
		System.out.println(105.0 > 105);
		System.out.println(105.1 > 105);
		
	}

}
