package Day15_Scanner;

 import java.util.Scanner;
 
public class Task01 {
	
	public static void main(String [] args) {
	/*
	 write a program that calculates the sum of two number entered by the user
	 */
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first number");
			int n1=input.nextInt();
	
	System.out.println("Enter second number");
			int n2=input.nextInt();
	
	System.out.println("The sum is: "+(n1+n2));
			
}
}

