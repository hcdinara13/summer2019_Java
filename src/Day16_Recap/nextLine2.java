package Day16_Recap;

import java.util.Scanner;

public class nextLine2 {

	/*
	 whire a program that accepts zip-code, city, state, phone number
	 then display all those gathered information 
	 do not use next() method
	 */
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please neter your zip code");
		int zipcode = input.nextInt();
		// 123456 enter
		
		input.nextLine(); // takes out enter
		System.out.println("Please enter your city name");
		String cityname = input.nextLine();
		
		System.out.println("zip code is: "+zipcode);
		System.out.println("city name is: "+cityname);
		
		System.out.println("Enter your phone number");
		String pn = input.nextLine();
		
	}
}
