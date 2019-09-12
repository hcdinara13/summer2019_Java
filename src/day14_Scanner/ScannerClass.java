package day14_Scanner;
/*
declaration of Scanner:
Scanner VariableName = new Scanner(System.in);

VariableName: can reference an object of the scanner class

new Scanner(System.in) : creates the object of the scanner class

methods of scanner class: 
	VariableName.nextByte():
		allows user to enter byte value
*/
import java.util.Scanner;
//this imports Scanner class only from java.util package

import java.util.*; 
//this imports all the class from Java.util package
//everything in scanner class is imported



public class ScannerClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //declaration
		System.out.println("Enter a byte Value");
			byte byteNum = input.nextByte();
			//only allows user to enter byte value
		
	System.out.println("You have entered: "+byteNum);
	
	System.out.println("Enter a Byte Value2");
	byte byteNum2 = input.nextByte();
	
	System.out.println("You have entered: "+byteNum2);
	
	System.out.println("Addition is: "+(byteNum + byteNum2));
		
	}

}
