package assignments;

public class GreaterNumber {

	public static void main( String [] args) {
		
		int num1 = 150;
		int num2 = 200;
		int max = 0;
		
		if (num1>num2) {
			max = num1;
			System.out.println(max+" biggest number");
		}
		else if (num2>num1) {
			max = num2;
			System.out.println(max+" biggest number");
	}
		else {
			System.out.println("numbers are equal");
	}
	}
}
